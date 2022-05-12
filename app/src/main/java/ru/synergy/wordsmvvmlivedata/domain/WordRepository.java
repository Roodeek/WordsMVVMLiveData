package ru.synergy.wordsmvvmlivedata.domain;

import androidx.lifecycle.LiveData;

import java.util.List;

import ru.synergy.wordsmvvmlivedata.data.room.Word;

public interface WordRepository {
    LiveData<List<Word>> getAllWords();

    void insert(Word word);

    void deleteAll();
}
