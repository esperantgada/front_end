package eg.esperantgada.appfrontenddevelopment.fragment

import android.annotation.SuppressLint
import android.app.Dialog
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import eg.esperantgada.appfrontenddevelopment.R

@Suppress("DEPRECATION")
class ProfileFragment : BottomSheetDialogFragment() {


/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
*/

    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        val view = View.inflate(requireContext(), R.layout.bottom_sheet, null)
        dialog.setContentView(view)
        view.parent.requestLayout()
        view.setBackgroundColor(resources.getColor(android.R.color.transparent))
        view.parent.requestFitSystemWindows()
    }
}