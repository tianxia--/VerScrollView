package com.cpf.verscrollview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{
	ScanView scanview;
	ScanViewAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scanview = (ScanView) findViewById(R.id.scanview);
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < 1000; i++)
			items.add("第 " + (i + 1) + " 页");
		adapter = new ScanViewAdapter(this, items);
		scanview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		return true;
	}

}
