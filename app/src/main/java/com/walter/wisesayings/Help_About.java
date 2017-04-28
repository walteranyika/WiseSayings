package com.walter.wisesayings;

import com.example.wisesayings.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Help_About extends Activity {
  @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.help_about);
	WebView tv=(WebView) findViewById(R.id.webView);
    tv.loadUrl("file:///android_asset/index.html");
}
}







