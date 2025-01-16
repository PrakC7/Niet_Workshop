#WAP to extract all email addresses from a given text.
import re

def extract_email_addresses(text):
    # Simple regex pattern to match email addresses.
    # email_pattern = r'[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}'
    return re.findall(r'\w+@\w+\.\w+', text)
    # Find all email addresses in the given text.
    # emails = re.findall(email_pattern, text)

    # return emails

# Input.
text = """
Please contact us at info@example.com for more details.
You can also email support@website.org or reach out to admin@company.com.
"""

# Extract and print the emails.
emails = extract_email_addresses(text)
for email in emails:
    print(email)