
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        
    </head>
    <body>
        <div class="word">
            
        </div>
        <% 
        
        
        %>
         name: <input type="text" id="name" onmouseover="Myfun()" value="">
    <br><br>
    last: <input type="text" id="last" onclick="Thatfun()">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <script>
function Myfun(){
    var x='Ashutosh';
    function thisfun(){
        document.write(x);
        
    }
}
    function Thatfun(){

    }
    
    
    
        window.SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
      
        const recognition = new SpeechRecognition();
        recognition.interimResults = true;
        recognition.lang = 'en-US';
        
        let p = document.createElement('p');
        const words = document.querySelector('.word');
        words.appendChild(p);
      
        recognition.addEventListener('result', e => {
          const transcript = Array.from(e.results)
            .map(result => result[0])
            .map(result => result.transcript)
            .join('');
      
            const poopScript = transcript.replace(/poop|poo|shit|dump/gi, '💩');
            p.textContent = poopScript;
      
            if (e.results[0].isFinal) {
              p = document.createElement('p');
              words.appendChild(p);
            }
        });
      
        recognition.addEventListener('end', recognition.start);
      
        recognition.start();
      
    </script>
    </body>
</html>
