# Implement a program to split a paragraph into sentences using regex.
import re

def split_into_sentences(paragraph):
    # Split by punctuation marks (., ?, !), followed by a space or end of string.
    sentences = re.split(r'(?<=[.?!])\s', paragraph)

    # Strip leading and trailing spaces from each sentence.
    return [sentence.strip() for sentence in sentences]

# Input.
paragraph = "Hello world! This is a test. Here's another sentence. Do you like it? Yes, I do. Well, this works."

sentences = split_into_sentences(paragraph)
for idx, sentence in enumerate(sentences, 1):
    print(f"Sentence {idx}: {sentence}")