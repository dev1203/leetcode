/**
 * @param {number[]} A
 * @return {number}
 */
var repeatedNTimes = function(A) {
    let map = {};
    let repeatedValue;
    A.forEach((element)=>{
        if (map[element] === true) {
            repeatedValue = element;
        }
        map[element] = true;
    })
    return repeatedValue;
};