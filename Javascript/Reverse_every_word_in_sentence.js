let sentence = "This is a sunny day";
const words = sentence.split(' ');
const reverseWords = words.map(word=>{
    return word.split('').reverse().join('');
});
const reverseSentence = reverseWords.join(' ');
console.log(reverseSentence);