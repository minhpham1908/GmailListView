package com.minh.listviewgmail;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

public class MailAdapter extends BaseAdapter {
    private List<Mail> listMail;
    private Context context;
    String pattern = "MMM dd";
    SimpleDateFormat simpleDateFormat;
    public MailAdapter(List<Mail> listMail, Context context){
        this.listMail = listMail;
        this.context = context;
        this.simpleDateFormat = new SimpleDateFormat(pattern);
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            convertView = ((Activity)context).getLayoutInflater().inflate(R.layout.list_item_layout, null);

            viewHolder = new ViewHolder();

            viewHolder.tvSender = convertView.findViewById(R.id.sender);
            viewHolder.tvSubject = convertView.findViewById(R.id.subject);
            viewHolder.tvContent = convertView.findViewById(R.id.content);
            viewHolder.tvDate = convertView.findViewById(R.id.date);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
    }
        final Mail gmail = listMail.get(position);

        viewHolder.tvSender.setText(gmail.getSender());
        viewHolder.tvSubject.setText(gmail.getSubject());
        viewHolder.tvContent.setText(gmail.getContent());
        viewHolder.tvDate.setText(simpleDateFormat.format(gmail.getDate()));


        return convertView;
    }

    public class ViewHolder {
        TextView tvSender,tvSubject, tvAvatar, tvDate, tvContent;
    }
}
