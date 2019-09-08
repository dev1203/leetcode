/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    let squaredArray;
    squaredArray =  A.map((element) => (element*element));
    return squaredArray.sort( function(a,b) { return a - b; } );
};
