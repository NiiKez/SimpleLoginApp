package com.example.simplelogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.simplelogin.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // UI-Elemente verknüpfen
        EditText editTextUsername = findViewById(R.id.editText); // Username
        EditText editTextPassword = findViewById(R.id.editText2); // Passwort

        Button saveButton = findViewById(R.id.button);     // Speichern/Login
        Button weiterButton = findViewById(R.id.button2);  // Weiter zur WelcomeActivity

        // SharedPreferences initialisieren
        SharedPreferences prefs = getSharedPreferences("myPrefs", MODE_PRIVATE);

        // Speichern/Login-Button
        saveButton.setOnClickListener(v -> {
            String username = editTextUsername.getText().toString();
            String password = editTextPassword.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Bitte Benutzername und Passwort eingeben", Toast.LENGTH_SHORT).show();
                return;
            }

            // Falls noch kein Benutzer gespeichert ist → registrieren
            String savedUser = prefs.getString("username", null);
            String savedPass = prefs.getString("password", null);

            if (savedUser == null || savedPass == null) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("username", username);
                editor.putString("password", password);
                editor.apply();
                Toast.makeText(this, "Registrierung erfolgreich!", Toast.LENGTH_SHORT).show();
                saveButton.setText("Gespeichert!");
            } else {
                // Login-Versuch
                if (savedUser.equals(username) && savedPass.equals(password)) {
                    Toast.makeText(this, "Login erfolgreich!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Login fehlgeschlagen", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Weiter-Button
        weiterButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}
