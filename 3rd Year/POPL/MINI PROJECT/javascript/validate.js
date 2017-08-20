// JavaScript Document

function ValidateFirstName()
{
	var FirstName=document.AdmissionForm.FirstName.value;
	var fld=document.AdmissionForm.FirstName;
	//var illegalchar=/[\W ]/;
	
	var illegalchar=/[\0-9\`\-\=\\\[\]\;\'\,\.\/\~\!\@\#\$\%\^\&\*\(\)\_\+\|\{\}\:\"\<\>\?\]]/;
	
	document.getElementById("FirstNameError").style.fontSize="12px";
	if (FirstName=="" || FirstName==null)
	{
		document.getElementById("FirstNameErrorImg").src="Images/alert.png";
		
		document.getElementById("FirstNameError").innerHTML="No First Name entered  !";
		document.getElementById("FirstNameError").style.color="#ff0000";
		document.getElementById("FirstName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if (FirstName.length<5)
	{
		document.getElementById("FirstNameErrorImg").src="Images/alert.png";

		document.getElementById("FirstNameError").innerHTML="First Name less than 5 characters  !";
		document.getElementById("FirstNameError").style.color="#ff0000";
		document.getElementById("FirstName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if(illegalchar.test(FirstName))
	{
		document.getElementById("FirstNameErrorImg").src="Images/alert.png";
		
		document.getElementById("FirstNameError").innerHTML="Illegal Character(s)  !";
		document.getElementById("FirstNameError").style.color="#ff0000";
		document.getElementById("FirstName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else
	{
		document.getElementById("FirstNameErrorImg").src="Images/tick.png";
		
		document.getElementById("FirstNameError").innerHTML="";
		document.getElementById("FirstName").style.border="1px solid #999999";
		return true;	
	}
	return true;
}
function ValidateLastName()
{
	var LastName=document.AdmissionForm.LastName.value;
	var fld=document.AdmissionForm.LastName;
	//var illegalchar=/[\W ]/;
	
	var illegalchar=/[\0-9\`\-\=\\\[\]\;\'\,\.\/\~\!\@\#\$\%\^\&\*\(\)\_\+\|\{\}\:\"\<\>\?\]]/;
	
	document.getElementById("LastNameError").style.fontSize="12px";
	if (LastName=="" || LastName==null)
	{
		document.getElementById("LastNameErrorImg").src="Images/alert.png";
		
		document.getElementById("LastNameError").innerHTML="No Last Name entered  !";
		document.getElementById("LastNameError").style.color="#ff0000";
		document.getElementById("LastName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if (LastName.length<5)
	{
		document.getElementById("LastNameErrorImg").src="Images/alert.png";
		
		document.getElementById("LastNameError").innerHTML="Last Name less than 5 characters  !";
		document.getElementById("LastNameError").style.color="#ff0000";
		document.getElementById("LastName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if(illegalchar.test(LastName))
	{
		document.getElementById("LastNameErrorImg").src="Images/alert.png";
		
		document.getElementById("LastNameError").innerHTML="Illegal Character(s)  !";
		document.getElementById("LastNameError").style.color="#ff0000";
		document.getElementById("LastName").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else
	{
		document.getElementById("LastNameErrorImg").src="Images/tick.png";
		
		document.getElementById("LastNameError").innerHTML="";
		document.getElementById("LastName").style.border="1px solid #999999";
		return true;	
	}
	return true;
}
function ValidatePhoneMobile(field)
{
	//var num=/^[0-9]$/;
	//var illegalchars=/[\A-Z\a-z\`\-\=\\\[\]\;\'\,\.\/\~\!\@\#\$\%\^\&\*\(\)\_\+\|\{\}\:\"\<\>\?\]]/;
	var illegalchars=/[\A-Z\a-z\`\=\\\[\]\;\'\,\.\/\~\!\@\#\$\%\^\&\*\(\)\_\|\{\}\:\"\<\>\?\]]/;
	
	if (field==document.AdmissionForm.PhoneNo)
	{
		fld=document.getElementById("PhoneNoError");	
		fld1=document.getElementById("PhoneNoErrorImg");
	}
	else if (field==document.AdmissionForm.MobileNo)
	{
		fld=document.getElementById("MobileNoError");	
		fld1=document.getElementById("MobileNoErrorImg");
	}
	fld.style.fontSize="12px";
	
	var number=field.value;
	
	if (number=="" || number==null)
	{
		fld1.src="Images/alert.png";
		
		fld.innerHTML="No Number  !";
		fld.style.color="#ff0000";
		field.style.border="1px solid #ff0000";
		field.focus();
		return false;
	}
	else if (illegalchars.test(number))
	{
		fld1.src="Images/alert.png";
		
		fld.innerHTML="Illegal Character(s)  !";
		fld.style.color="#ff0000";
		field.style.border="1px solid #ff0000";
		field.focus();
		return false;
	}
	else
	{
		fld1.src="Images/tick.png";
		
		fld.innerHTML="";
		field.style.border="1px solid #999999";
		return true;	
	}
	return true;
}
function ValidateEmail()
{
	var emailFilter = /^[^@]+@[^@.]+\.[^@]*\w\w$/ ;
	var illegalChars= /[\(\)\<\>\,\;\:\\\"\[\!\`\#\$\%\^\&\*\+\-\|\~\]]/ ;
	var email=document.AdmissionForm.Email.value;
	var fld=document.AdmissionForm.Email;
	
	if (email=="" || email==null) 
	{
		document.getElementById("EmailErrorImg").src="Images/alert.png";
		
		document.getElementById("EmailError").innerHTML="No Email entered  !";
		document.getElementById("EmailError").style.color="#ff0000";
		document.getElementById("Email").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	} 
	else if (!emailFilter.test(email)) 
	{              
		document.getElementById("EmailErrorImg").src="Images/alert.png";
		
		document.getElementById("EmailError").innerHTML="Email not in format *@*.**  !";
		document.getElementById("EmailError").style.color="#ff0000";
		document.getElementById("Email").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	} 
	else if (email.match(illegalChars)) 
	{
		document.getElementById("EmailErrorImg").src="Images/alert.png";
		
		document.getElementById("EmailError").innerHTML="Illegal Character(s)  !";
		document.getElementById("EmailError").style.color="#ff0000";
		document.getElementById("Email").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	} 
	else 
	{
		document.getElementById("EmailErrorImg").src="Images/tick.png";
		
		document.getElementById("EmailError").innerHTML="";
		document.getElementById("Email").style.border="1px solid #999999";
		return true;	
	}
	return true;	
}
function ValidateUsername()
{
	var Username=document.AdmissionForm.Username.value;
	var illegalchar=/[\W ]/;
	var fld=document.AdmissionForm.Username;

	if (Username=="" || Username==null)
	{
		document.getElementById("UsernameErrorImg").src="Images/alert.png";
		
		document.getElementById("UsernameError").innerHTML="No Username entered  !";
		document.getElementById("UsernameError").style.color="#ff0000";
		document.getElementById("Username").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if (Username.length<5)
	{
		document.getElementById("UsernameErrorImg").src="Images/alert.png";
		
		document.getElementById("UsernameError").innerHTML="Username less than 5 characters  !";
		document.getElementById("UsernameError").style.color="#ff0000";
		document.getElementById("Username").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if(illegalchar.test(Username))
	{
		document.getElementById("UsernameErrorImg").src="Images/alert.png";
		
		document.getElementById("UsernameError").innerHTML="Illegal Character(s)  !";
		document.getElementById("UsernameError").style.color="#ff0000";
		document.getElementById("Username").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else
	{
		document.getElementById("UsernameErrorImg").src="Images/tick.png";
		
		document.getElementById("UsernameError").innerHTML="";
		document.getElementById("Username").style.border="1px solid #999999";
		return true;
	}
	return true;
}
function ValidateAge()
{
	var num=/^[0-9]$/;
	var illegalchars=/[\A-Z\a-z\`\-\=\\\[\]\;\'\,\.\/\~\!\@\#\$\%\^\&\*\(\)\_\+\|\{\}\:\"\<\>\?\]]/;
	var userage=document.AdmissionForm.Age.value;
	var fld=document.AdmissionForm.Age;

	if (userage=="Birth Date in Future")
	{
		document.getElementById("AgeErrorImg").src="Images/alert.png";
		
		document.getElementById("AgeError").innerHTML="Birth Date in Future  !";
		document.getElementById("AgeError").style.color="#ff0000";
		document.getElementById("Age").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	if (userage=="" || userage==null)
	{
		document.getElementById("AgeErrorImg").src="Images/alert.png";
		
		document.getElementById("AgeError").innerHTML="No Age entered  !";
		document.getElementById("AgeError").style.color="#ff0000";
		document.getElementById("Age").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if (illegalchars.test(userage))
	{
		document.getElementById("AgeErrorImg").src="Images/alert.png";
		
		document.getElementById("AgeError").innerHTML="Illegal Character(s)  !";
		document.getElementById("AgeError").style.color="#ff0000";
		document.getElementById("Age").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else if (parseInt(userage)>100)
	{
		document.getElementById("AgeErrorImg").src="Images/alert.png";
	
		document.getElementById("AgeError").innerHTML="Your Age seem to fake  !";
		document.getElementById("AgeError").style.color="#ff0000";
		document.getElementById("Age").style.border="1px solid #ff0000";
		fld.focus();
		return false;
	}
	else
	{
		document.getElementById("AgeErrorImg").src="Images/tick.png";
		
		document.getElementById("AgeError").innerHTML="";
		document.getElementById("Age").style.border="1px solid #999999";
		return true;
	}
	return true;
}
function ClearField(Field)
{
	Field.style.border="1px solid #999999";
}
function CalculateAge()
{
	var Date1=new Date();
	//Date1.setFullYear(2012,1,1);
	var age;
	
	var year=Date1.getFullYear();
	var month=Date1.getMonth();
	var day=Date1.getDate();
	//alert(year);
	//alert(month);
	//alert(day);
	y=document.AdmissionForm.Year.value;
	m=document.AdmissionForm.Month.value;
	d=document.AdmissionForm.Day.value;
	//alert(y);
	//alert(m);
	//alert(d);
	
	if (y==year)
	{
		if (m-1==month)
		{
			if (d>day)
			{
				document.AdmissionForm.Age.value="Birth Date in Future";
				document.AdmissionForm.Age.style.color="#000000";	
			}
			else
			{
				if(month>m-1)
				{
					age=year-y;
				}
				else if(month==m-1)
				{
					if(day>=d)
					{
						age=year-y;	
					}
					else
					{
						age=year-y-1;
					}
				}
				else
				{
					age=year-y-1;
				}
				document.AdmissionForm.Age.value=age;
				document.AdmissionForm.Age.style.color="#000000";
			}
		}
		else if(m>month)
		{
			document.AdmissionForm.Age.value="Birth Date in Future";
			document.AdmissionForm.Age.style.color="#000000";		
		}
		else
		{
			if(month>m-1)
			{
				age=year-y;
			}
			else if(month==m-1)
			{
				if(day>=d)
				{
					age=year-y;	
				}
				else
				{
					age=year-y-1;
				}
			}
			else
			{
				age=year-y-1;
			}
			document.AdmissionForm.Age.value=age;
			document.AdmissionForm.Age.style.color="#000000";	
		}
	}
	else
	{
		if(month>m-1)
		{
			age=year-y;
		}
		else if(month==m-1)
		{
			if(day>=d)
			{
				age=year-y;	
			}
			else
			{
				age=year-y-1;
			}
		}
		else
		{
			age=year-y-1;
		}
		document.AdmissionForm.Age.value=age;
		document.AdmissionForm.Age.style.color="#000000";	
	}
	ValidateAge();
}
function ValidatePercentage(field)
{
		if(field.value>100 || field.value<0 || field.value==null || field.value=="")
		{
			//document.getElementById("AgeErrorImg").src="Images/alert.png";
			
			
			field.style.border="1px solid #ff0000";
			field.focus();
			return false;	
		}
		else
		{
			//document.getElementById("AgeErrorImg").src="Images/tick.png";
		
			
			field.style.border="1px solid #999999";
			return true;	
		}
}
function ChangeFieldAggregate()
{
	var field=document.AdmissionForm.AdmissionDepartment.value;
	//alert(field);
	if(field=="ComputerEngineering" || field=="CivilEngineering" || field=="MechanicalEngineering" || field=="ElectricalEngineering" || field=="ElectronicsAndCommunicationEngineering" || field=="GeomaticsEngineering" || field=="ComputerScience" || field=="AppliedScience")
	{
			document.AdmissionForm.PCMFieldAggregate.checked=true;
			document.AdmissionForm.PCMFieldAggregate.disabled=false;
			document.AdmissionForm.PCMPhysics.disabled=false;
			document.AdmissionForm.PCMChemistry.disabled=false;
			document.AdmissionForm.PCMMaths.disabled=false;
			
			document.AdmissionForm.PCBFieldAggregate.checked=false;
			document.AdmissionForm.PCBFieldAggregate.disabled=true;
			document.AdmissionForm.PCBPhysics.disabled=true;
			document.AdmissionForm.PCBChemistry.disabled=true;
			document.AdmissionForm.PCBBiology.disabled=true;
			
			document.AdmissionForm.ENLFieldAggregate.checked=false;
			document.AdmissionForm.ENLFieldAggregate.disabled=true;
			document.AdmissionForm.MEnglish.disabled=true;
			document.AdmissionForm.MNepali.disabled=true;
			document.AdmissionForm.MLiterature.disabled=true;
			
			document.AdmissionForm.EEAFieldAggregate.checked=false;
			document.AdmissionForm.EEAFieldAggregate.disabled=true;
			document.AdmissionForm.MGMTEnglish.disabled=true;
			document.AdmissionForm.MGMTEconomics.disabled=true;
			document.AdmissionForm.MGMTAccounting.disabled=true;

			

			document.AdmissionForm.PCMPhysics.value=0;
			document.AdmissionForm.PCMChemistry.value=0;
			document.AdmissionForm.PCMMaths.value=0;
			
	
			document.AdmissionForm.PCBPhysics.value=0;
			document.AdmissionForm.PCBChemistry.value=0;
			document.AdmissionForm.PCBBiology.value=0;
			
		
			document.AdmissionForm.MEnglish.value=0;
			document.AdmissionForm.MNepali.value=0;
			document.AdmissionForm.MLiterature.value=0;
			
		
			document.AdmissionForm.MGMTEnglish.value=0;
			document.AdmissionForm.MGMTEconomics.value=0;
			document.AdmissionForm.MGMTAccounting.value=0;
			document.AdmissionForm.EEAPercentage.value=0;
			document.AdmissionForm.ENLPercentage.value=0;
			document.AdmissionForm.PCBPercentage.value=0;
			document.AdmissionForm.PCMPercentage.value=0;


			CalculatePercentage(document.AdmissionForm.PCMPhysics,document.AdmissionForm.PCMChemistry,document.AdmissionForm.PCMMaths,document.AdmissionForm.PCMPercentage);
			
			
	}
	else if(field=="Pharmacy" || field=="Dentistry" || field=="MBBS" || field=="StaffNursing" || field=="BN" || field=="BTECH")
	{
		document.AdmissionForm.PCMFieldAggregate.checked=false;
			document.AdmissionForm.PCMFieldAggregate.disabled=true;
			document.AdmissionForm.PCMPhysics.disabled=true;
			document.AdmissionForm.PCMChemistry.disabled=true;
			document.AdmissionForm.PCMMaths.disabled=true;
			
			document.AdmissionForm.PCBFieldAggregate.checked=true;
			document.AdmissionForm.PCBFieldAggregate.disabled=false;
			document.AdmissionForm.PCBPhysics.disabled=false;
			document.AdmissionForm.PCBChemistry.disabled=false;
			document.AdmissionForm.PCBBiology.disabled=false;
			
			document.AdmissionForm.ENLFieldAggregate.checked=false;
			document.AdmissionForm.ENLFieldAggregate.disabled=true;
			document.AdmissionForm.MEnglish.disabled=true;
			document.AdmissionForm.MNepali.disabled=true;
			document.AdmissionForm.MLiterature.disabled=true;
			
			document.AdmissionForm.EEAFieldAggregate.checked=false;
			document.AdmissionForm.EEAFieldAggregate.disabled=true;
			document.AdmissionForm.MGMTEnglish.disabled=true;
			document.AdmissionForm.MGMTEconomics.disabled=true;
			document.AdmissionForm.MGMTAccounting.disabled=true;

			document.AdmissionForm.PCMPhysics.value=0;
			document.AdmissionForm.PCMChemistry.value=0;
			document.AdmissionForm.PCMMaths.value=0;
			
	
			document.AdmissionForm.PCBPhysics.value=0;
			document.AdmissionForm.PCBChemistry.value=0;
			document.AdmissionForm.PCBBiology.value=0;
			
		
			document.AdmissionForm.MEnglish.value=0;
			document.AdmissionForm.MNepali.value=0;
			document.AdmissionForm.MLiterature.value=0;
			
		
			document.AdmissionForm.MGMTEnglish.value=0;
			document.AdmissionForm.MGMTEconomics.value=0;
			document.AdmissionForm.MGMTAccounting.value=0;
			document.AdmissionForm.EEAPercentage.value=0;
			document.AdmissionForm.ENLPercentage.value=0;
			document.AdmissionForm.PCBPercentage.value=0;
			document.AdmissionForm.PCMPercentage.value=0;

			CalculatePercentage(document.AdmissionForm.PCBPhysics,document.AdmissionForm.PCBChemistry,document.AdmissionForm.PCBBiology,document.AdmissionForm.PCBPercentage);
		
	}
	else if(field=="Media")
	{
		document.AdmissionForm.PCMFieldAggregate.checked=false;
			document.AdmissionForm.PCMFieldAggregate.disabled=true;
			document.AdmissionForm.PCMPhysics.disabled=true;
			document.AdmissionForm.PCMChemistry.disabled=true;
			document.AdmissionForm.PCMMaths.disabled=true;
			
			document.AdmissionForm.PCBFieldAggregate.checked=false;
			document.AdmissionForm.PCBFieldAggregate.disabled=true;
			document.AdmissionForm.PCBPhysics.disabled=true;
			document.AdmissionForm.PCBChemistry.disabled=true;
			document.AdmissionForm.PCBBiology.disabled=true;
			
			document.AdmissionForm.ENLFieldAggregate.checked=true;
			document.AdmissionForm.ENLFieldAggregate.disabled=false;
			document.AdmissionForm.MEnglish.disabled=false;
			document.AdmissionForm.MNepali.disabled=false;
			document.AdmissionForm.MLiterature.disabled=false;
			
			document.AdmissionForm.EEAFieldAggregate.checked=false;
			document.AdmissionForm.EEAFieldAggregate.disabled=true;
			document.AdmissionForm.MGMTEnglish.disabled=true;
			document.AdmissionForm.MGMTEconomics.disabled=true;
			document.AdmissionForm.MGMTAccounting.disabled=true;




			document.AdmissionForm.PCMPhysics.value=0;
			document.AdmissionForm.PCMChemistry.value=0;
			document.AdmissionForm.PCMMaths.value=0;
			
	
			document.AdmissionForm.PCBPhysics.value=0;
			document.AdmissionForm.PCBChemistry.value=0;
			document.AdmissionForm.PCBBiology.value=0;
			
		
			document.AdmissionForm.MEnglish.value=0;
			document.AdmissionForm.MNepali.value=0;
			document.AdmissionForm.MLiterature.value=0;
			
		
			document.AdmissionForm.MGMTEnglish.value=0;
			document.AdmissionForm.MGMTEconomics.value=0;
			document.AdmissionForm.MGMTAccounting.value=0;
			document.AdmissionForm.EEAPercentage.value=0;
			document.AdmissionForm.ENLPercentage.value=0;
			document.AdmissionForm.PCBPercentage.value=0;
			document.AdmissionForm.PCMPercentage.value=0;
			CalculatePercentage(document.AdmissionForm.MEnglish,document.AdmissionForm.MNepali,document.AdmissionForm.MLiterature,document.AdmissionForm.ENLPercentage);
		
	}
	else if(field=="BBA" || field=="BBS")
	{
		document.AdmissionForm.PCMFieldAggregate.checked=false;
			document.AdmissionForm.PCMFieldAggregate.disabled=true;
			document.AdmissionForm.PCMPhysics.disabled=true;
			document.AdmissionForm.PCMChemistry.disabled=true;
			document.AdmissionForm.PCMMaths.disabled=true;
			
			document.AdmissionForm.PCBFieldAggregate.checked=false;
			document.AdmissionForm.PCBFieldAggregate.disabled=true;
			document.AdmissionForm.PCBPhysics.disabled=true;
			document.AdmissionForm.PCBChemistry.disabled=true;
			document.AdmissionForm.PCBBiology.disabled=true;
			
			document.AdmissionForm.ENLFieldAggregate.checked=false;
			document.AdmissionForm.ENLFieldAggregate.disabled=true;
			document.AdmissionForm.MEnglish.disabled=true;
			document.AdmissionForm.MNepali.disabled=true;
			document.AdmissionForm.MLiterature.disabled=true;
			
			document.AdmissionForm.EEAFieldAggregate.checked=true;
			document.AdmissionForm.EEAFieldAggregate.disabled=false;
			document.AdmissionForm.MGMTEnglish.disabled=false;
			document.AdmissionForm.MGMTEconomics.disabled=false;
			document.AdmissionForm.MGMTAccounting.disabled=false;



			document.AdmissionForm.PCMPhysics.value=0;
			document.AdmissionForm.PCMChemistry.value=0;
			document.AdmissionForm.PCMMaths.value=0;
			
	
			document.AdmissionForm.PCBPhysics.value=0;
			document.AdmissionForm.PCBChemistry.value=0;
			document.AdmissionForm.PCBBiology.value=0;
			
		
			document.AdmissionForm.MEnglish.value=0;
			document.AdmissionForm.MNepali.value=0;
			document.AdmissionForm.MLiterature.value=0;
			
		
			document.AdmissionForm.MGMTEnglish.value=0;
			document.AdmissionForm.MGMTEconomics.value=0;
			document.AdmissionForm.MGMTAccounting.value=0;

			document.AdmissionForm.EEAPercentage.value=0;
			document.AdmissionForm.ENLPercentage.value=0;
			document.AdmissionForm.PCBPercentage.value=0;
			document.AdmissionForm.PCMPercentage.value=0;
			CalculatePercentage(document.AdmissionForm.MGMTEnglish,document.AdmissionForm.MGMTEconomics,document.AdmissionForm.MGMTAccounting,document.AdmissionForm.EEAPercentage);
			
		

		
	}
}
function ValidateMark(field)
{
	if(field.value>100 || field.value<0)
		{
			//document.getElementById("AgeErrorImg").src="Images/alert.png";
			
			
			field.style.border="1px solid #ff0000";
			field.focus();
			CalculatePercentage(document.AdmissionForm.PCMPhysics,document.AdmissionForm.PCMChemistry,document.AdmissionForm.PCMMaths,document.AdmissionForm.PCMPercentage);

CalculatePercentage(document.AdmissionForm.PCBPhysics,document.AdmissionForm.PCBChemistry,document.AdmissionForm.PCBBiology,document.AdmissionForm.PCBPercentage);
		
CalculatePercentage(document.AdmissionForm.MEnglish,document.AdmissionForm.MNepali,document.AdmissionForm.MLiterature,document.AdmissionForm.ENLPercentage);
		
CalculatePercentage(document.AdmissionForm.MGMTEnglish,document.AdmissionForm.MGMTEconomics,document.AdmissionForm.MGMTAccounting,document.AdmissionForm.EEAPercentage);
			
			return false;	
		}
		else
		{
			//document.getElementById("AgeErrorImg").src="Images/tick.png";
		
			
			field.style.border="1px solid #999999";
			CalculatePercentage(document.AdmissionForm.PCMPhysics,document.AdmissionForm.PCMChemistry,document.AdmissionForm.PCMMaths,document.AdmissionForm.PCMPercentage);

CalculatePercentage(document.AdmissionForm.PCBPhysics,document.AdmissionForm.PCBChemistry,document.AdmissionForm.PCBBiology,document.AdmissionForm.PCBPercentage);
		
CalculatePercentage(document.AdmissionForm.MEnglish,document.AdmissionForm.MNepali,document.AdmissionForm.MLiterature,document.AdmissionForm.ENLPercentage);
		
CalculatePercentage(document.AdmissionForm.MGMTEnglish,document.AdmissionForm.MGMTEconomics,document.AdmissionForm.MGMTAccounting,document.AdmissionForm.EEAPercentage);
			
			return true;	
		}
		
		
			
}
function CalculatePercentage(f1,f2,f3,R)
{
	R.value=(parseInt(f1.value)+parseInt(f2.value)+parseInt(f3.value))/3;

}
function ValidateFieldQualification()
{
	if (document.AdmissionForm.SLCBoard.value==null || document.AdmissionForm.SLCBoard.value=="")
	{
		document.AdmissionForm.SLCBoard.style.border="1px solid #ff0000";
		document.AdmissionForm.SLCBoard.focus();
		return false;	
	}
	else
	{
		document.AdmissionForm.SLCBoard.style.border="1px solid #999999";
		if (document.AdmissionForm.School.value==null || document.AdmissionForm.School.value=="")
		{
			document.AdmissionForm.School.style.border="1px solid #ff0000";
			document.AdmissionForm.School.focus();
			return false;	
		}
		else
		{
			document.AdmissionForm.School.style.border="1px solid #999999";
			if (document.AdmissionForm.HSSBoard.value==null || document.AdmissionForm.HSSBoard.value=="")
			{
				document.AdmissionForm.HSSBoard.style.border="1px solid #ff0000";
				document.AdmissionForm.HSSBoard.focus();
				return false;	
			}
			else
			{
				document.AdmissionForm.HSSBoard.style.border="1px solid #999999";
				if (document.AdmissionForm.HSSSchool.value==null || document.AdmissionForm.HSSSchool.value=="")
				{
					document.AdmissionForm.HSSSchool.style.border="1px solid #ff0000";
					document.AdmissionForm.HSSSchool.focus();
					return false;	
				}
				else
				{
					document.AdmissionForm.HSSSchool.style.border="1px solid #999999";
					return true;
				}

			}

		}

	}

}
function ValidatePassword()
{
	document.getElementById("PasswordError").style.color="#ff0000";
	if (document.AdmissionForm.Password.value==null || document.AdmissionForm.Password.value=="")
	{
		document.AdmissionForm.Password.style.border="1px solid #ff0000";
		document.getElementById("PasswordErrorImg").src="Images/alert.png";
		document.getElementById("PasswordError").innerHTML="Empty Password  !";
		document.AdmissionForm.Password.focus();
		return false;
	}
	else if (document.AdmissionForm.Password.value.length>50)
	{
		document.AdmissionForm.Password.style.border="1px solid #ff0000";
		document.getElementById("PasswordErrorImg").src="Images/alert.png";
		document.getElementById("PasswordError").innerHTML="Password greater than 50 characters  !";
		document.AdmissionForm.Password.focus();
		return false;
	}
	else
	{
		document.getElementById("PasswordErrorImg").src="Images/tick.png";
		document.getElementById("PasswordError").innerHTML="";
		document.AdmissionForm.Password.style.border="1px solid #999999";
		return true;
	}
}
function ValidateAddress()
{
	document.getElementById("AddressError").style.color="#ff0000";
	if (document.AdmissionForm.Address.value==null || document.AdmissionForm.Address.value=="")
	{
		document.AdmissionForm.Address.style.border="1px solid #ff0000";
		document.getElementById("AddressErrorImg").src="Images/alert.png";
		document.getElementById("AddressError").innerHTML="Empty Address  !";
		document.AdmissionForm.Address.focus();
		return false;
	}
	else if (document.AdmissionForm.Address.value.length>50)
	{
		document.AdmissionForm.Address.style.border="1px solid #ff0000";
		document.getElementById("AddressErrorImg").src="Images/alert.png";
		document.getElementById("AddressError").innerHTML="Address greater than 50 characters  !";
		document.AdmissionForm.Address.focus();
		return false;
	}
	else
	{
		document.getElementById("AddressErrorImg").src="Images/tick.png";
		document.getElementById("AddressError").innerHTML="";
		document.AdmissionForm.Address.style.border="1px solid #999999";
		return true;
	}
}
function ValidateAgreement()
{
	if (document.AdmissionForm.Agreement.checked==true)
	{
		document.getElementById("AgreementErrorImg").src="Images/transparent.png";
		document.getElementById("AgreementError").innerHTML="";
		document.getElementById("AgreementError").style.color="#ff0000";
		return true;
	}
	else
	{
		document.getElementById("AgreementErrorImg").src="Images/alert.png";
		document.getElementById("AgreementError").innerHTML="Please accept above condition  !";
		document.getElementById("AgreementError").style.color="#ff0000";
		return false;
	}
}
function ValidateForm()
{
	if (ValidateFirstName()==true && ValidateLastName()==true && ValidateAge()==true && ValidateAddress()==true && ValidatePhoneMobile(document.AdmissionForm.PhoneNo)==true && ValidatePhoneMobile(document.AdmissionForm.MobileNo)==true && ValidateEmail()==true && ValidateUsername()==true && ValidatePassword()==true && ValidatePercentage(document.AdmissionForm.Percantage)==true && ValidatePercentage(document.AdmissionForm.HSSPercantage)==true)
	{
		if (ValidateMark(document.AdmissionForm.PCMPhysics)==true && ValidateMark(document.AdmissionForm.PCMChemistry)==true && ValidateMark(document.AdmissionForm.PCMMaths)==true && ValidateMark(document.AdmissionForm.PCBPhysics)==true && ValidateMark(document.AdmissionForm.PCBChemistry)==true && ValidateMark(document.AdmissionForm.PCBBiology)==true && ValidateMark(document.AdmissionForm.MEnglish)==true && ValidateMark(document.AdmissionForm.MNepali)==true && ValidateMark(document.AdmissionForm.MLiterature)==true && ValidateMark(document.AdmissionForm.MGMTEnglish)==true && ValidateMark(document.AdmissionForm.MGMTEconomics)==true && ValidateMark(document.AdmissionForm.MGMTAccounting)==true)
		{
			if(ValidateFieldQualification()==true)
			{
				if (ValidateAgreement()==true)
				{
					return true;	
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;	
	}
	return true;
}
