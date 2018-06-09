package ir.charnal.davod.a4nalfinal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelNoticeCategory;

public class NoticeCategoryAdapter extends RecyclerView.Adapter<NoticeCategoryAdapter.NoticeCategoryViewHolder>  {
    //is not necessary now.
    private final Context context;
    private final List<DataModelNoticeCategory> noticeCategories;

    public NoticeCategoryAdapter(Context context, List<DataModelNoticeCategory> noticeCategories){

        this.context = context;
        this.noticeCategories = noticeCategories;
    }

    @NonNull
    @Override
    public NoticeCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_category_notice_layout,parent,false);
        return new NoticeCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeCategoryViewHolder holder, int position) {
        DataModelNoticeCategory dataModelNoticeCategory = noticeCategories.get(position);
        holder.noticeCategory.setText(dataModelNoticeCategory.getNoticeCategory());

    }

    @Override
    public int getItemCount() {
        return noticeCategories.size();
    }


    public class NoticeCategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView noticeCategory;


        public NoticeCategoryViewHolder(View itemView) {
            super(itemView);
            noticeCategory = itemView.findViewById(R.id.text_view_notice_category);
        }
    }


}
