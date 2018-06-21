package com.example.JEdwardMarsh;


import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
	

	private MediaPlayer mPlayer;
	
	public void stop(){
		if (mPlayer != null){
			mPlayer.release();
			mPlayer = null;
			}
	}
	
	//Play sound when tile is clicked
	public void play(Context c){
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.fire_bow_sound);
		
		//release resource when finished playing sound.
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			public void onCompletion(MediaPlayer mp){
				stop();
			}
		});
		
		mPlayer.start();
	}
	
	//Play sound when tile is clicked twice
	public void play2(Context c){
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.shotgun_moss);
		
		//release resource when finished playing sound.
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			public void onCompletion(MediaPlayer mp){
				stop();
			}
		});
		
		mPlayer.start();
	}
	
	//Play sound when tile is destroyed
	public void play3(Context c){
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.woosh);
		
		//release resource when finished playing sound.
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			public void onCompletion(MediaPlayer mp){
				stop();
			}
		});
		
		mPlayer.start();
	}
	
	
	
}
