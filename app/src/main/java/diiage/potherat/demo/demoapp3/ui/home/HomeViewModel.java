package diiage.potherat.demo.demoapp3.ui.home;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import diiage.potherat.demo.demoapp3.dal.repository.QuoteRepository;
import diiage.potherat.demo.demoapp3.model.Quote;

public class HomeViewModel extends ViewModel {

    private QuoteRepository quoteRepository;
    public MutableLiveData<Integer> numberOfQuotes;
    public MutableLiveData<Integer> distinctSource;
    public MutableLiveData<Quote> lastQuote;


    @Inject
    @ViewModelInject
    public HomeViewModel(QuoteRepository quoteRepository) {

        this.quoteRepository = quoteRepository;

        this.numberOfQuotes = new MutableLiveData<>();
        this.lastQuote = new MutableLiveData<>();
        this.distinctSource = new MutableLiveData<>();

    }

}