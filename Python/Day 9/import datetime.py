from datetime import datetime

#GET THE CURRENT DATE AND TIME.
now = datetime.now()
print(now)

#FORMAT THE DATE.
print(now.strftime("%Y-%m-%d %H:%M:%S"))