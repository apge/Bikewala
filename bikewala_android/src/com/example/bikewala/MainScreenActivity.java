package com.example.bikewala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends Activity {

    Button btnViewUsers;
    Button btnNewUsers;

    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main_screen);

	// Buttons
	btnViewUsers = (Button) findViewById(R.id.btnViewUser);
	btnNewUsers = (Button) findViewById(R.id.btnCreateUser);

	// view products click event
	btnViewUsers.setOnClickListener(new View.OnClickListener() {

	    @Override
	    public void onClick(View view) {
		// Launching All products Activity
		Intent i = new Intent(getApplicationContext(),
			AllUsersActivity.class);
		startActivity(i);

	    }
	});

	// view products click event
	btnNewUsers.setOnClickListener(new View.OnClickListener() {

	    @Override
	    public void onClick(View view) {
		// Launching create new product activity
		Intent i = new Intent(getApplicationContext(),
			NewUserActivity.class);
		startActivity(i);

	    }
	});
    }
}