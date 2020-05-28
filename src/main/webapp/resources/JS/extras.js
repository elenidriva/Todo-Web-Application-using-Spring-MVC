var divs = document.querySelectorAll('.textholder'), i;

for (i = 0; i < divs.length; ++i) {
    console.log(divs[i]);     
	if(divs[i].innerHTML == 'HIGH'){
         divs[i].style.color = "#A81B08";
         divs[i].style.fontWeight = "700";
	} else if (divs[i].innerHTML == 'MEDIUM'){
         divs[i].style.color = "#F5AA18";

  }
}


class TodoList {
  constructor() {
    this.$checkboxes = document.querySelectorAll('input[type="checkbox"]');
    this.onChange = this.onChange.bind(this);

    this.$checkboxes.forEach(($checkbox) => {
      // Set the state of each checkbox from LocalStorage
      const id = $checkbox.getAttribute('id');
      let currentState = this.getState(id);
      
      if (currentState === 'true') {
        $checkbox.setAttribute('checked', currentState);
      }
      
      // Add a listener for when the checkbox changes
      $checkbox.addEventListener('change', () => this.onChange($checkbox));
    });
  }
  
  /**
   * @function onChange
   * @param {$checkbox} HTMLInputElement
   */
  onChange($checkbox) {
    // Get the `id` attribute from the checkbox eg. `checkbox-1`
    // This is used to keep track of the checkbox in LocalStorage
    const id = $checkbox.getAttribute('id');
    this.setState(id, $checkbox.checked);

  }
  
  /**
   * @function getState
   * @param {checkboxID} String
   * Returns the state of a particular checkbox in LocalStorage
   */
  getState(checkboxID) {
    return localStorage.getItem(checkboxID);
  }
  
  /**
   * @function setState
   * @param {checkboxID} String
   * Sets the state of a particular checkbox in LocalStorage
   */
  setState(checkboxID, state) {
    localStorage.setItem(checkboxID, state); 
  }
}

const App = new TodoList();