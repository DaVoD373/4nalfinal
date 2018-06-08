package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.SingleNoticeInformationActivity;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelNotice;

public class RecyclerViewNoticeAdapter extends RecyclerView.Adapter<RecyclerViewNoticeAdapter.NoticeViewHolder> {

    private Context context;
    private List<DataModelNotice> notices;

    public RecyclerViewNoticeAdapter(Context context, List<DataModelNotice> notices) {
        this.context = context;
        this.notices = notices;
    }

    @NonNull
    @Override
    public NoticeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notice_model_layout,parent,false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeViewHolder holder, int position) {
            DataModelNotice notice = notices.get(position);
            holder.imageView.setImageDrawable(notice.getImage());
            holder.title.setText(notice.getTitle());
            holder.content.setText(notice.getContent());
            holder.date.setText(notice.getDate());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SingleNoticeInformationActivity.class);
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return notices.size();
    }

    public class NoticeViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;
        private TextView content;
        private TextView date;

        public NoticeViewHolder(View itemView) {
            super(itemView);
             imageView = itemView.findViewById(R.id.image_notice);
             title = itemView.findViewById(R.id.text_notice_title);
             content = itemView.findViewById(R.id.text_notice_content);
             date = itemView.findViewById(R.id.text_notice_date);
        }
    }
}
