/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let defangedAddress = '';
    for (let element = 0; element<address.length; element++) {
        let character = address[element];
        if (character === '.') {
            character = '[.]'
        }
        defangedAddress += character;
    }
    return defangedAddress;
};