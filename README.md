# champions.league

## Get countries api
http://localhost:8085/fifa/countries

[{"country_id":41,"country_name":"England","country_logo":"https://apiv2.apifootball.com/badges/logo_country/41_england.png"},
{"country_id":46,"country_name":"France","country_logo":"https://apiv2.apifootball.com/badges/logo_country/46_france.png"}]

## Get leagues by country id
http://localhost:8085/fifa/country/41/leagues

[{"country_id":41,"country_name":"England","league_id":149,"league_name":"Championship"}]

## Get teams by league id
[{"team_key":2615,"team_name":"Bournemouth","team_badge":"https://apiv2.apifootball.com/badges/2615_bournemouth.png"},
{"team_key":2618,"team_name":"Swansea","team_badge":"https://apiv2.apifootball.com/badges/2618_swansea.png"},
{"team_key":2622,"team_name":"Huddersfield","team_badge":"https://apiv2.apifootball.com/badges/2622_huddersfield.png"},
{"team_key":2623,"team_name":"Watford","team_badge":"https://apiv2.apifootball.com/badges/2623_watford.png"},
{"team_key":2624,"team_name":"Stoke City","team_badge":"https://apiv2.apifootball.com/badges/2624_stoke-city.png"},
{"team_key":2631,"team_name":"Birmingham","team_badge":"https://apiv2.apifootball.com/badges/2631_birmingham.png"},
{"team_key":2634,"team_name":"Nottingham","team_badge":"https://apiv2.apifootball.com/badges/2634_nottingham.png"},
{"team_key":2637,"team_name":"Cardiff","team_badge":"https://apiv2.apifootball.com/badges/2637_cardiff.png"},
{"team_key":2638,"team_name":"Millwall","team_badge":"https://apiv2.apifootball.com/badges/2638_millwall.png"},
{"team_key":2641,"team_name":"Norwich","team_badge":"https://apiv2.apifootball.com/badges/2641_norwich.png"},
{"team_key":2642,"team_name":"Derby","team_badge":"https://apiv2.apifootball.com/badges/2642_derby.png"},
{"team_key":2643,"team_name":"Preston","team_badge":"https://apiv2.apifootball.com/badges/2643_preston.png"},
{"team_key":2644,"team_name":"Brentford","team_badge":"https://apiv2.apifootball.com/badges/2644_brentford.png"},
{"team_key":2645,"team_name":"QPR","team_badge":"https://apiv2.apifootball.com/badges/2645_qpr.png"},
{"team_key":2647,"team_name":"Reading","team_badge":"https://apiv2.apifootball.com/badges/2647_reading.png"},
{"team_key":2648,"team_name":"Middlesbrough","team_badge":"https://apiv2.apifootball.com/badges/2648_middlesbrough.png"},
{"team_key":2650,"team_name":"Bristol City","team_badge":"https://apiv2.apifootball.com/badges/2650_bristol-city.png"},
{"team_key":2651,"team_name":"Sheffield Wed","team_badge":"https://apiv2.apifootball.com/badges/2651_sheffield-wed.png"},
{"team_key":2652,"team_name":"Barnsley","team_badge":"https://apiv2.apifootball.com/badges/2652_barnsley.png"},
{"team_key":2675,"team_name":"Rotherham","team_badge":"https://apiv2.apifootball.com/badges/2675_rotherham.png"},
{"team_key":2680,"team_name":"Blackburn","team_badge":"https://apiv2.apifootball.com/badges/2680_blackburn.png"},
{"team_key":2695,"team_name":"Luton","team_badge":"https://apiv2.apifootball.com/badges/2695_luton.png"},
{"team_key":2696,"team_name":"Coventry","team_badge":"https://apiv2.apifootball.com/badges/2696_coventry.png"},
{"team_key":2703,"team_name":"Wycombe","team_badge":"https://apiv2.apifootball.com/badges/2703_wycombe.png"}]

## Get standing by team
http://localhost:8085/fifa/standings/149/?team_id=2641&country_name=England

[{
	"country_name": "England",
	"league_id": 149,
	"league_name": "Championship",
	"team_id": 2641,
	"team_name": "Norwich",
	"overall_league_position": 1,
	"team_badge": "https://apiv2.apifootball.com/badges/2641_norwich.png"
}]
