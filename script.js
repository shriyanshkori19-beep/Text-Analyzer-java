document.getElementById('analyzebtn').addEventListener('click', function(){

    let text = document.getElementById('textInput').value;

    let words = text.trim().split(/\s+/);
    let wordcount = text.trim() === "" ? 0 : words.length;
    
    

    let vowelcount= 0;
    let consonantcount = 0;
    text = text.toLowerCase();

    for(let i=0; i<text.length; i++){
        let c = text.charAt(i);

        if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o'){
            vowelcount++;
        }
        else if(c>='a' && c<='z'){
            consonantcount++;
        }
    }
    document.getElementById('wordcount').textContent= wordcount;

    document.getElementById('vowelcount').textContent= vowelcount;
    document.getElementById('consonantcount').textContent = consonantcount;

})