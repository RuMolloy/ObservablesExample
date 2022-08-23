# ObservablesExample
Exploring differences between LiveData, StateFlow, SharedFlow and Flow

*LiveData<String>* -> Value retained in ViewModel after configuration change and observer updated after configuration change

*StateFlow<String>* -> Value retained in ViewModel after configuration change and value re-emitted after configuration change

*SharedFlow<String>* -> Value retained in ViewModel after configuration change but value only emitted once (not repeated after configuration change). Good for say a snackbar to show an error message from a network call.

*Flow<String>* -> Value emitted once and does not survive configuration change

## Demo
<img src="https://user-images.githubusercontent.com/9675246/186152880-abc628de-911c-4f66-87ce-c7e70490b47f.gif" width="25%" height="25%"/>


## Screenshots
<p float="left">
<img src="https://user-images.githubusercontent.com/9675246/186156032-15eeeb72-ccd7-48a7-9e83-479ee48bfd7a.jpg" width="25%" height="25%" />
<img src="https://user-images.githubusercontent.com/9675246/186156044-a45bb142-9341-404b-8116-22db47558a36.jpg" width="25%" height="25%" />
<img src="https://user-images.githubusercontent.com/9675246/186156072-74db84d6-244d-482a-9e76-15821530e5f7.jpg" width="50%" height="50%" />
