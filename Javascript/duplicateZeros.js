/**
 * @param {number[]} arr
 * @return {void} Do not return anything, modify arr in-place instead.
 */
var duplicateZeros = function(arr) {
    let length = arr.length;
    for (let index = 0; index <= length; index++) {
        let element = arr[index];
        if (element === 0) {
            arr.splice(index, 0, 0);
            index++;
        }
    }
    arr.length = length;
};