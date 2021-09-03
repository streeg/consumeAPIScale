import requests
import json

# url of the API to be consumed
url = 'https://amock.io/api/fcmaia/countries'

# capture malformed json.
response = requests.get(url)

print("The countries received by API ordered by number of borders are:\n\n")

# turn the capture into a json
data = response.json()
# store the country code and name values
dictData = {country['code']: country['name'] for country in data}
# Store the values of the name and the borders
dictDataBorders = {country['name']:  country['fronteiras'] for country in data}
print("Country code:     |    Country name:   \n_________________________________________")
# scan the dictionary, ordering by the size of the border from smallest to largest.
for country in sorted(dictDataBorders, key=lambda country: len(dictDataBorders[country]), reverse=True):
    for code in dictData:
        if(country == dictData[code]):
            print("|    "+ code + "            |          " + country)
        
    