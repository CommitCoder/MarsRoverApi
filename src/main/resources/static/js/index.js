
let marsApiButtons = document.querySelectorAll("button[id*='marsApi']")
//assigning 3 event listeners to 3 buttons
marsApiButtons.forEach( buttonSth => buttonSth.addEventListener('click', function() {
                                    const buttonId = this.id
                                    const roverId = buttonId.split('marsApi')[1]
                                    let apiData = document.getElementById('marsApiRoverData')
                                    apiData.value = roverId
                                    document.getElementById('frmRoverType').submit()
                                    // alert(roverId)
                                }))

let marsRoverType = getUrlParameter('marsApiRoverData')

highlightButtonByRoverType(marsRoverType);

// setting text box new value  after submitting
// let marsSol = getUrlParameter("marsSol");
// document.getElementById('marsSol').value = marsSol;

function highlightButtonByRoverType(roverType){
    if(roverType == '') {roverType = 'Opportunity'}
    document.getElementById('marsApi' + roverType).classList.remove('btn-primary')
    document.getElementById( 'marsApi' +roverType).classList.add('btn-info')
}


function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

