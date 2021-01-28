package diiage.potherat.demo.demoapp3.ui.home;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import diiage.potherat.demo.demoapp3.dal.repository.QuoteRepository;
import diiage.potherat.demo.demoapp3.model.Quote;

public class HomeViewModel extends ViewModel {

    private QuoteRepository quoteRepository;
    public LiveData<Integer> numberOfQuotes;
    public LiveData<Integer> distinctSource;
    public LiveData<Quote> lastQuote;


    @Inject
    @ViewModelInject
    public HomeViewModel(QuoteRepository quoteRepository) {

        this.quoteRepository = quoteRepository;

        //this.numberOfQuotes = new MutableLiveData<>();
        //this.lastQuote = new MutableLiveData<>();
        //this.distinctSource = new MutableLiveData<>();

        //this.distinctSource = quoteRepository.getCountSource();


    }

    public QuoteRepository getQuoteRepository() {
        return quoteRepository;
    }

    public LiveData<String> getNumberOfQuotes() {
        return Transformations.map(quoteRepository.getCountQuote(), quote -> {
            return quote.toString();
        });
    }

    public LiveData<Integer> getDistinctSource() {
        return distinctSource;
    }

    public LiveData<Quote> getLastQuote() {
        return lastQuote;
    }
}