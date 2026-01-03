package startup.project.lumera.ui.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import startup.project.lumera.R;
import startup.project.lumera.ui.activity.MainActivity;

public class AccountFragment extends Fragment {

    public AccountFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        Button logout = view.findViewById(R.id.btnLogout);

        logout.setOnClickListener(v -> {
            SharedPreferences prefs =
                    requireActivity().getSharedPreferences("lumera_prefs", Context.MODE_PRIVATE);

            prefs.edit().clear().apply();

            startActivity(new Intent(getActivity(), MainActivity.class));
            requireActivity().finish();
        });

        View history = view.findViewById(R.id.optionHistory);
        ((ImageView) history.findViewById(R.id.optionIcon))
                .setImageResource(R.drawable.ic_history);
        ((TextView) history.findViewById(R.id.optionTitle))
                .setText("Skin Analysis History");
        ((TextView) history.findViewById(R.id.optionSubtitle))
                .setText("5 scans this month");

        View saved = view.findViewById(R.id.optionSaved);
        ((ImageView) saved.findViewById(R.id.optionIcon))
                .setImageResource(R.drawable.ic_heart);
        ((TextView) saved.findViewById(R.id.optionTitle))
                .setText("Saved Products");
        ((TextView) saved.findViewById(R.id.optionSubtitle))
                .setText("12 items");

        View subscription = view.findViewById(R.id.optionSubscription);
        ((ImageView) subscription.findViewById(R.id.optionIcon))
                .setImageResource(R.drawable.ic_subscription);
        ((TextView) subscription.findViewById(R.id.optionTitle))
                .setText("Subscription");
        ((TextView) subscription.findViewById(R.id.optionSubtitle))
                .setText("Free Plan");

        View language = view.findViewById(R.id.optionLanguage);
        ((ImageView) language.findViewById(R.id.optionIcon))
                .setImageResource(R.drawable.ic_language);
        ((TextView) language.findViewById(R.id.optionTitle))
                .setText("Language");
        ((TextView) language.findViewById(R.id.optionSubtitle))
                .setText("English");

        return view;
    }
}
