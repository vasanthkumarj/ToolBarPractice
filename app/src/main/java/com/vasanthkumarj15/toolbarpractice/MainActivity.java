package com.vasanthkumarj15.toolbarpractice;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private ConstraintLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout1=findViewById(R.id.constlayout);
        Toolbar t=findViewById(R.id.toolbar);
        t.setTitle("Tool Bar!");
        t.setSubtitle("is here");

        t.inflateMenu(R.menu.menu_toolbar);
        t.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String s= (String) menuItem.getTitle();
                Toast.makeText(MainActivity.this,s+" selected",Toast.LENGTH_SHORT).show();
                switch (menuItem.getItemId())
                {
                    case R.id.delete:
                        
                        break;

                     default:
                         break;

                }
                return true;
            }
        });
    }
}
