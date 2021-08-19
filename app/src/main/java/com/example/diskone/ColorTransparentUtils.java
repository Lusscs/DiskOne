package com.example.diskone;

import android.util.Log;

public class ColorTransparentUtils {


	public static final int defaultColorID = android.R.color.black;
	public static final String defaultColor = "000000";
	public static final String TAG = "ColorTransparentUtils";

	public static String convert(int trans) {
		String hexString = Integer.toHexString(Math.round(255 * trans / 100));
		return (hexString.length() < 2 ? "0" : "") + hexString;
	}

	public static String transparentColor(int colorCode, int trans) {
		return convertIntoColor(colorCode, trans);
	}


	public static String convertIntoColor(int colorCode, int transCode) {
		String color = defaultColor;
		try{
			color = Integer.toHexString(colorCode).toUpperCase().substring(2);
		}catch (Exception ignored){}

		if (!color.isEmpty() && transCode < 100) {
			if (color.trim().length() == 6) {
				return "#" + convert(transCode) + color;
			} else {
				Log.d(TAG, "Color is already with transparency");
				return convert(transCode) + color;
			}
		}
		return "#" + Integer.toHexString(defaultColorID).toUpperCase().substring(2);
	}
}
