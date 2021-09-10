// alert('testing')
let marsApiButtons = document.querySelectorAll("button[id*='marsApi']")

//assigning 3 event listeners to 3 buttons
marsApiButtons.forEach( buttonSth => buttonSth.addEventListener("click", function() {
                                    const buttonId = this.id
                                    const roverId = buttonId.split("marsApi")[1]
                                    alert(roverId)
                                }))
