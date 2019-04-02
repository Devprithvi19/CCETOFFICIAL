package com.example.ccetofficial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ccetofficial.draweritrems.Myprofile;
import com.example.ccetofficial.draweritrems.aboutus;


public class ccetDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton about_ccet,syllabus,qp,Worksp,gallery,faculty,committees,Result;
    TextView textView,textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccet_drawer);
        about_ccet=(ImageButton)findViewById(R.id.b0);
        syllabus=(ImageButton)findViewById(R.id.b1);
        qp=(ImageButton)findViewById(R.id.b2);
        Worksp=(ImageButton)findViewById(R.id.b3);
        gallery=(ImageButton)findViewById(R.id.b4);
        faculty=(ImageButton)findViewById(R.id.b5);
        committees=(ImageButton)findViewById(R.id.b6);
        Result=(ImageButton)findViewById(R.id.b7);

        textView=(TextView)findViewById(R.id.text0);
        textView1=(TextView)findViewById(R.id.taptext);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //About CCET.....
        about_ccet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ccetDrawer.this, "Opening....", Toast.LENGTH_SHORT).show();
               Intent intent=new Intent(getApplicationContext(),Aboutccet.class);
               startActivity(intent);

            }
        });


        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Syllabus.class);
                startActivity(intent);
            }
        });

        qp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),papers.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, "Opening Question Papers....", Toast.LENGTH_SHORT).show();
            }
        });

        Worksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Workshop.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, "Opening Workshop Details....", Toast.LENGTH_SHORT).show();
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Gallery.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, " Opening Gallery......", Toast.LENGTH_SHORT).show();
            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Faculty.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, "Opening Faculty Details....", Toast.LENGTH_SHORT).show();
            }
        });

        committees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Committees.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, "Opening Committees Details....", Toast.LENGTH_SHORT).show();
            }
        });
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Result.class);
                startActivity(intent);
                Toast.makeText(ccetDrawer.this, "Opening Result....", Toast.LENGTH_SHORT).show();
            }
        });

        //*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {

               // Intent intent=new Intent(getApplicationContext(),Notice.class);
                //startActivity(intent);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ccet_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
         if (id == R.id.MYProfile) {
             Intent intent=new Intent(this, Myprofile.class);
             startActivity(intent);
        }else  if(id==R.id.AboutUs){
             Intent intent=new Intent(this, aboutus.class);
             startActivity(intent);
             }
             else if (id==R.id.nav_tool){
             Toast.makeText(this, "Feature Coming Soon", Toast.LENGTH_SHORT).show();
         }
        else if (id == R.id.nav_share) {
             Toast.makeText(this, "Feature Coming Soon", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_send) {
             Toast.makeText(this, "Feature Coming Soon", Toast.LENGTH_SHORT).show();

         }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
