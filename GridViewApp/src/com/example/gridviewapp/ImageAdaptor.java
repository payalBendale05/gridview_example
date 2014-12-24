package com.example.gridviewapp;

import javax.security.auth.PrivateCredentialPermission;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdaptor extends BaseAdapter {
	
		private Context mContext;
		
		public ImageAdaptor(Context context){
			mContext = context;
			}
	

	

	@Override
	public int getCount() {
		
		return mThubIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup parent) {

		ImageView imageView;
		if(convertview == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(150,150));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(5,5,5,5);
		}else{
			imageView = (ImageView) convertview;
		}
		imageView.setImageResource(mThubIds[position]);
		
		
		return imageView;
	}

	public Integer[] mThubIds = {
	R.drawable.sample_0,R.drawable.sample_1,
	R.drawable.sample_2,R.drawable.sample_3,
	R.drawable.sample_4,R.drawable.sample_5,
	R.drawable.sample_6,R.drawable.sample_7,
	R.drawable.sample_3,R.drawable.sample_0,
	R.drawable.sample_2,R.drawable.sample_1,
	R.drawable.sample_4,R.drawable.sample_6,
	R.drawable.sample_7,R.drawable.sample_0,
	R.drawable.sample_7,R.drawable.flowers,
	
};
}
