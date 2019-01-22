<h3 class="text-center">Veuillez renseigner ci-dessous les
	informations du nouveau client</h3>
<div class="alert alert-info text-center" role="alert">Note : les
	numéros de comptes sont générés automatiquement.</div>
<form class="formStyle" method="post" action="Conseiller?page=modifie-client">
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="isEntreprise"
			data-original-title="Préciser le type de client">Type de client</label>
		<div class="col-md-7">
			<select required="required" class="form-control" name="isEntreprise">
				<option value="">Le client est :</option>
				<option value="true">Une entreprise</option>
				<option value="false">Un particulier</option>
			</select>
		</div>
	</div>

	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="name"
			data-original-title="Préciser le nom">Nom</label>
		<div class="col-md-7">
			<input type="text" id="name" name="nom"
				class="form-control text-format form-control" value="${unClient.nom }"
				placeholder="Nom du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="firstname"
			data-original-title="Préciser le prénom">Prénom</label>
		<div class="col-md-7">
			<input type="text" id="firstname" name="prenom"
				class="form-control text-format form-control" value="${unClient.prenom }"
				placeholder="Prénom du client">
		</div>
	</div>

	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="residence"
			data-original-title="Préciser l'adresse">Adresse </label>
		<div class="col-md-7">
			<input type="text" id="adresse" name="adresse"
				class="form-control text-format form-control" value="${unClient.adresse }"
				placeholder="Adresse du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="ville"
			data-original-title="Préciser la ville">Ville</label>
		<div class="col-md-7">
			<input type="text" id="ville" name="ville"
				class="form-control text-format form-control" value="${unClient.ville }"
				placeholder="Ville du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="postalCode"
			data-original-title="Préciser le code postal">Code postal</label>
		<div class="col-md-7">
			<input type="number" min="10000" max="99999" name="codePostal"
				id="postalCode" class="form-control" placeholder="Code postal"
				value="${unClient.code_postal }" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="phone"
			data-original-title="Préciser le numéro de téléphone">Numéro
			de téléphone</label>
		<div class="col-md-7">
			<input type="text" name="phone" id="phone" class="form-control"
				placeholder="Téléphone portable" value="${unClient.telephone }" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="gender"
			data-original-title="Préciser la Carte bancaire">Carte bancaire</label>
		<div class="col-md-7">
			<select required="required" class="form-control" name="carteBancaire">
				<option value="">préciser</option>
				<option value="1">Visa classique</option>
				<option value="2">Visa premium</option>
			</select>
		</div>
	</div>

	
	<div class="form-group">
		<div class="">
			<div class="col-sm-2 col-sm-offset-5">
				<button type="submit" name="createClient" id="createClient"
					class="form-control btn btn-success">Enregistrer</button>
			</div>
		</div>
	</div>
</form>