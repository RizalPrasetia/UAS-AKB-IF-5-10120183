package com.rizalprasetia10120183.uasakbif5_10120183;

//NIM     :   10120183
//NAMA    :   RIZAL PRASETIA SUPRIADI
//KELAS   :   IF-5

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //        Layout
        final LinearLayout noteLayout = findViewById(R.id.noteLayout);
        final LinearLayout profilLayout = findViewById(R.id.profilLayout);
        final LinearLayout infoLayout = findViewById(R.id.infoLayout);
        final LinearLayout logoutLayout = findViewById(R.id.logoutLayout);

//        image
        final ImageView noteImage = findViewById(R.id.noteImage);
        final ImageView profilImage = findViewById(R.id.profilImage);
        final ImageView infoImage = findViewById(R.id.infoImage);
        final ImageView logoutImage = findViewById(R.id.logoutImage);

//        text
        final TextView noteTxt = findViewById(R.id.noteTxt);
        final TextView profilTxt = findViewById(R.id.profilTxt);
        final TextView infoTxt = findViewById(R.id.infoTxt);
        final TextView logoutTxt = findViewById(R.id.logoutTxt);


        //        Awal Perpindahan Menu

        //set lokasi fragment
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmenContainer, NoteFragment.class, null)
                .commit();

        noteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 1){

                    //set lokasi fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmenContainer, NoteFragment.class, null)
                            .commit();

//                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
//                    startActivity(intent);

                    profilTxt.setVisibility(View.GONE);
                    infoTxt.setVisibility(View.GONE);
                    logoutTxt.setVisibility(View.GONE);

                    profilImage.setImageResource(R.drawable.icons_profil);
                    infoImage.setImageResource(R.drawable.icons_info);
                    logoutImage.setImageResource(R.drawable.logout);

                    profilLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    infoLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    logoutLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    noteTxt.setVisibility(View.VISIBLE);
                    noteImage.setImageResource(R.drawable.notes);
                    noteLayout.setBackgroundResource(R.drawable.round_back_maps_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    noteLayout.startAnimation(scaleAnimation);

                    selectedTab = 1;
                }
            }
        });

        profilLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 2){

                    //set profil fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmenContainer, ProfilFragment.class, null)
                            .commit();

                    noteTxt.setVisibility(View.GONE);
                    infoTxt.setVisibility(View.GONE);
                    logoutTxt.setVisibility(View.GONE);

                    noteImage.setImageResource(R.drawable.notes);
                    infoImage.setImageResource(R.drawable.icons_info);
                    logoutImage.setImageResource(R.drawable.logout);

                    noteLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    infoLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    noteLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    logoutLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    profilTxt.setVisibility(View.VISIBLE);
                    profilImage.setImageResource(R.drawable.icons_profil);
                    profilLayout.setBackgroundResource(R.drawable.round_back_profil_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    profilLayout.startAnimation(scaleAnimation);

                    selectedTab = 2;
                }
            }
        });

        infoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 3){

                    //set info fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmenContainer, InfoFragment.class, null)
                            .commit();

                    noteTxt.setVisibility(View.GONE);
                    profilTxt.setVisibility(View.GONE);
                    logoutTxt.setVisibility(View.GONE);

                    noteImage.setImageResource(R.drawable.notes);
                    profilImage.setImageResource(R.drawable.icons_profil);
                    logoutImage.setImageResource(R.drawable.logout);

                    noteLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profilLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    infoTxt.setVisibility(View.VISIBLE);
                    infoImage.setImageResource(R.drawable.icons_info);
                    infoLayout.setBackgroundResource(R.drawable.round_back_info_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    infoLayout.startAnimation(scaleAnimation);

                    selectedTab = 3;
                }
            }
        });

        logoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 4){

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity2.this);

                    // set title dialog
                    alertDialogBuilder.setTitle("Are you sure want to LogOut?");

                    // set pesan dari dialog
                    alertDialogBuilder
                            .setMessage("Click Yes for Logout!")
                            .setIcon(R.mipmap.ic_launcher)
                            .setCancelable(false)
                            .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    FirebaseAuth.getInstance().signOut();
                                    startActivity(new Intent(MainActivity2.this,LoginActivity.class));
                                    finish();
                                }
                            })
                            .setNegativeButton("No",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });

                    // membuat alert dialog dari builder
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // menampilkan alert dialog
                    alertDialog.show();


                }
            }
        });


//        Akhir perpindahan Menu

    }
}