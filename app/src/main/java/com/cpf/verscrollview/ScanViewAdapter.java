package com.cpf.verscrollview;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class ScanViewAdapter extends PageAdapter
{
	Context context;
	List<String> items;
	AssetManager am;

	public ScanViewAdapter(Context context, List<String> items)
	{
		this.context = context;
		this.items = items;
		am = context.getAssets();
	}

	public void addContent(View view, int position)
	{
		TextView content = (TextView) view.findViewById(R.id.content);
		TextView tv = (TextView) view.findViewById(R.id.index);
		if ((position - 1) < 0 || (position - 1) >= getCount())
			return;
		content.setText("    但黑书的来历不清不楚，倒让杨开有些忌惮。万一这是什么陷阱呢？想到这，杨开又是一阵讪笑，自己现在不过是个凌霄阁的试炼弟子，谁会费劲心思来对付自己啊？\n" +
				"\n" +
				"    不过从后面几行字的字面意思来看，黑石枕头之所以会转变成黑书，恐怕和今rì自己的那个梦有关。\n" +
				"\n" +
				"    自己枕了它一年多都没有变化，偏偏今rì变成了黑书，与自己梦中的心境转变是脱不开关系的。");
		tv.setText(items.get(position - 1));
	}

	public int getCount()
	{
		return items.size();
	}

	public View getView()
	{
		View view = LayoutInflater.from(context).inflate(R.layout.page_layout,
				null);
		return view;
	}
}
