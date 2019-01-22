<h3 class="text-center">Veuillez renseigner ci-dessous les
	informations du nouveau client</h3>
<div class="alert alert-info text-center" role="alert">Note : les
	num�ros de comptes sont g�n�r�s automatiquement.</div>
<form class="formStyle" method="post" action="Conseiller?page=ajout-client">
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="isEntreprise"
			data-original-title="Pr�ciser le type de client">Type de client</label>
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
			data-original-title="Pr�ciser le nom">Nom</label>
		<div class="col-md-7">
			<input type="text" id="name" name="nom"
				class="form-control text-format form-control" value=""
				placeholder="Nom du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="firstname"
			data-original-title="Pr�ciser le pr�nom">Pr�nom</label>
		<div class="col-md-7">
			<input type="text" id="firstname" name="prenom"
				class="form-control text-format form-control" value=""
				placeholder="Pr�nom du client">
		</div>
	</div>

	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="residence"
			data-original-title="Pr�ciser l'adresse">Adresse </label>
		<div class="col-md-7">
			<input type="text" id="adresse" name="adresse"
				class="form-control text-format form-control" value=""
				placeholder="Adresse du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="ville"
			data-original-title="Pr�ciser la ville">Ville</label>
		<div class="col-md-7">
			<input type="text" id="ville" name="ville"
				class="form-control text-format form-control" value=""
				placeholder="Ville du client" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="postalCode"
			data-original-title="Pr�ciser le code postal">Code postal</label>
		<div class="col-md-7">
			<input type="number" min="10000" max="99999" name="codePostal"
				id="postalCode" class="form-control" placeholder="Code postal"
				value="" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="phone"
			data-original-title="Pr�ciser le num�ro de t�l�phone">Num�ro
			de t�l�phone</label>
		<div class="col-md-7">
			<input type="text" name="phone" id="phone" class="form-control"
				placeholder="T�l�phone portable" value="" required='required'>
		</div>
	</div>

		
	<div class="form-group">
		<div class="">
			<div class="col-sm-2 col-sm-offset-5">
				<button type="submit" name="createClient" id="createClient"
					class="form-control btn btn-success">Valider</button>
			</div>
		</div>
	</div>
</form>