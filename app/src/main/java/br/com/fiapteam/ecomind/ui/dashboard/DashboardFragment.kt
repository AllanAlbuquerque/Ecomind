package br.com.fiapteam.ecomind.ui.dashboard

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.fiapteam.ecomind.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        view?.let { super.onViewCreated(it, savedInstanceState) }
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        val myWebView = binding.dashboardWebview
        myWebView.webViewClient  = WebViewClient()
        myWebView.loadUrl("https://fiap-esg-alpha.vercel.app/esg")
        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.allowContentAccess = true
        myWebView.settings.domStorageEnabled = true
        myWebView.settings.useWideViewPort = true
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}