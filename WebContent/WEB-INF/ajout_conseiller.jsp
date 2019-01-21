<h3 class="text-center">Veuillez renseigner ci-dessous les
	informations du nouveau conseiller</h3>
<div class="alert alert-info text-center" role="alert">Note : les
	références conseiller sont générés automatiquement.</div>
	
<form class="formStyle" method="post" action="addConseiller">

	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="nom"
			data-original-title="Préciser le nom">Nom</label>
		<div class="col-md-7">
			<input type="text" id="nom" name="nom"
				class="form-control text-format form-control" value=""
				placeholder="Nom du conseiller" required='required'>
		</div>
	</div>
	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="prenom"
			data-original-title="Préciser le prénom">Prénom</label>
		<div class="col-md-7">
			<input type="text" id="prenom" name="prenom"
				class="form-control text-format form-control" value=""
				placeholder="Prénom du conseiller"  required='required'>
		</div>
	</div>

	<div class="form-group">
		<label
			class="control-label col-md-5 text-right control-label"
			data-toggle="tooltip" title="" for="email"
			data-original-title="Préciser l'adresse mail">Email</label>
		<div class="col-md-7">
			<input type="email" id="email" name="email"
				class="form-control text-format form-control" value=""
				placeholder="ex : c1@proxi.bk">
		</div>
	</div>



	
	<div class="form-group">
		<div class="">
			<div class="col-sm-2 col-sm-offset-5">
				<button type="submit" name="createConseiller" id="createConseiller"
					class="form-control btn btn-success">Valider</button>
			</div>
		</div>
	</div>
</form>