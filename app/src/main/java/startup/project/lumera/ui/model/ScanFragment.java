package startup.project.lumera.ui.model;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import startup.project.lumera.R;

public class ScanFragment extends Fragment {

    public ScanFragment() {
        super(R.layout.fragment_scan);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button startScanBtn = view.findViewById(R.id.btnStartScan);

        startScanBtn.setOnClickListener(v -> {
            Toast.makeText(requireContext(), "Scanning...", Toast.LENGTH_SHORT).show();
        });
    }
}

