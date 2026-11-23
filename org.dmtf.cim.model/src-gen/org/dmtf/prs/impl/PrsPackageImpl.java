/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs.impl;

import org.dmtf.cim.CimPackage;

import org.dmtf.cim.impl.CimPackageImpl;

import org.dmtf.prs.PRS_Activity;
import org.dmtf.prs.PRS_ActivityContact;
import org.dmtf.prs.PRS_ActivityResource;
import org.dmtf.prs.PRS_ActivityTransaction;
import org.dmtf.prs.PRS_Address;
import org.dmtf.prs.PRS_AddressLocation;
import org.dmtf.prs.PRS_AdminAssociation;
import org.dmtf.prs.PRS_Administrative;
import org.dmtf.prs.PRS_AdministrativeContact;
import org.dmtf.prs.PRS_AdministrativeRevision;
import org.dmtf.prs.PRS_Agreement;
import org.dmtf.prs.PRS_Attached;
import org.dmtf.prs.PRS_Attachment;
import org.dmtf.prs.PRS_Categorization;
import org.dmtf.prs.PRS_Category;
import org.dmtf.prs.PRS_CategoryParentChild;
import org.dmtf.prs.PRS_Contact;
import org.dmtf.prs.PRS_ContactContactItem;
import org.dmtf.prs.PRS_ContactItem;
import org.dmtf.prs.PRS_ContactItemAddress;
import org.dmtf.prs.PRS_ContactOrganization;
import org.dmtf.prs.PRS_ContactPerson;
import org.dmtf.prs.PRS_ExchangeElement;
import org.dmtf.prs.PRS_Expression;
import org.dmtf.prs.PRS_ExpressionElement;
import org.dmtf.prs.PRS_ExpressionLink;
import org.dmtf.prs.PRS_Feature;
import org.dmtf.prs.PRS_FeatureResource;
import org.dmtf.prs.PRS_Location;
import org.dmtf.prs.PRS_Organization;
import org.dmtf.prs.PRS_Person;
import org.dmtf.prs.PRS_Problem;
import org.dmtf.prs.PRS_Product;
import org.dmtf.prs.PRS_ProductAsset;
import org.dmtf.prs.PRS_ProductComponent;
import org.dmtf.prs.PRS_ProductParentChild;
import org.dmtf.prs.PRS_Reference;
import org.dmtf.prs.PRS_Resolution;
import org.dmtf.prs.PRS_ResolutionResource;
import org.dmtf.prs.PRS_Resource;
import org.dmtf.prs.PRS_Revision;
import org.dmtf.prs.PRS_RevisionContact;
import org.dmtf.prs.PRS_SISService;
import org.dmtf.prs.PRS_ServiceActivity;
import org.dmtf.prs.PRS_ServiceAgreement;
import org.dmtf.prs.PRS_ServiceIncident;
import org.dmtf.prs.PRS_ServiceProblem;
import org.dmtf.prs.PRS_ServiceProvider;
import org.dmtf.prs.PRS_ServiceRequester;
import org.dmtf.prs.PRS_ServiceResolutionSolution;
import org.dmtf.prs.PRS_Solution;
import org.dmtf.prs.PRS_SolutionCategory;
import org.dmtf.prs.PRS_SolutionElement;
import org.dmtf.prs.PRS_SolutionExpression;
import org.dmtf.prs.PRS_SolutionHasElement;
import org.dmtf.prs.PRS_SolutionProblem;
import org.dmtf.prs.PRS_SolutionReference;
import org.dmtf.prs.PRS_SolutionResolution;
import org.dmtf.prs.PRS_Statement;
import org.dmtf.prs.PRS_StatementFeature;
import org.dmtf.prs.PRS_Transaction;
import org.dmtf.prs.PrsFactory;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrsPackageImpl extends EPackageImpl implements PrsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ExchangeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ExpressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_FeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_LocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_RevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceIncidentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_StatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_TransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ActivityResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ActivityTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AddressLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AdministrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AdministrativeRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AttachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_CategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_CategoryParentChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactItemAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ExpressionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_FeatureResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_OrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ProductAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ProductComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ProductParentChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ResolutionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_RevisionContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceRequesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ServiceResolutionSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionHasElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SolutionResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_StatementFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ActivityContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AdminAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AdministrativeContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_AttachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_CategorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactContactItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_ContactPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prS_SISServiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.dmtf.prs.PrsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrsPackageImpl() {
		super(eNS_URI, PrsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PrsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrsPackage init() {
		if (isInited) return (PrsPackage)EPackage.Registry.INSTANCE.getEPackage(PrsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrsPackageImpl thePrsPackage = registeredPrsPackage instanceof PrsPackageImpl ? (PrsPackageImpl)registeredPrsPackage : new PrsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI);
		CimPackageImpl theCimPackage = (CimPackageImpl)(registeredPackage instanceof CimPackageImpl ? registeredPackage : CimPackage.eINSTANCE);

		// Load packages
		theCimPackage.loadPackage();

		// Create package meta-data objects
		thePrsPackage.createPackageContents();

		// Initialize created meta-data
		thePrsPackage.initializePackageContents();

		// Fix loaded packages
		theCimPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrsPackage.eNS_URI, thePrsPackage);
		return thePrsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ExchangeElement() {
		return prS_ExchangeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ExchangeElement_PRSUniqueName() {
		return (EAttribute)prS_ExchangeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ExchangeElement_DirtyFlag() {
		return (EAttribute)prS_ExchangeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ExpressionElement() {
		return prS_ExpressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Feature() {
		return prS_FeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Feature_Prompt() {
		return (EAttribute)prS_FeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Feature_ValidValues() {
		return (EAttribute)prS_FeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Feature_DataType() {
		return (EAttribute)prS_FeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Location() {
		return prS_LocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Location_LocationType() {
		return (EAttribute)prS_LocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Location_LocationID() {
		return (EAttribute)prS_LocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Product() {
		return prS_ProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Product_Vendor() {
		return (EAttribute)prS_ProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Product_ProductName() {
		return (EAttribute)prS_ProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Product_Version() {
		return (EAttribute)prS_ProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Product_Order() {
		return (EAttribute)prS_ProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Resource() {
		return prS_ResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Resource_ResourceType() {
		return (EAttribute)prS_ResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Resource_Quantity() {
		return (EAttribute)prS_ResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Resource_Units() {
		return (EAttribute)prS_ResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Revision() {
		return prS_RevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Revision_RevisionDate() {
		return (EAttribute)prS_RevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Revision_ActivityName() {
		return (EAttribute)prS_RevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Revision_ActivityType() {
		return (EAttribute)prS_RevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Revision_TechnicalStatus() {
		return (EAttribute)prS_RevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Revision_EditorialStatus() {
		return (EAttribute)prS_RevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceIncident() {
		return prS_ServiceIncidentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_RequesterID() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_ProviderID() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_CurrentState() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_RequesterSeverity() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_ProviderPriority() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_ResponseTime() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_WorkflowStatus() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_Comment() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_Entitled() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_Acknowledge() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_TransactionName() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_ServiceIncident_LastTransaction() {
		return (EAttribute)prS_ServiceIncidentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Solution() {
		return prS_SolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Solution_Title() {
		return (EAttribute)prS_SolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Solution_SolutionAbstract() {
		return (EAttribute)prS_SolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Solution_SolutionType() {
		return (EAttribute)prS_SolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionElement() {
		return prS_SolutionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Statement() {
		return prS_StatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_StatementRole() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_Text() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_StatementOperator() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_FeatureValue() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_Order() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Statement_Relevance() {
		return (EAttribute)prS_StatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Transaction() {
		return prS_TransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Transaction_TransactionType() {
		return (EAttribute)prS_TransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Transaction_TransactionState() {
		return (EAttribute)prS_TransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Transaction_CompletionStatus() {
		return (EAttribute)prS_TransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Activity() {
		return prS_ActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_ParameterList() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_NewKeys() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_Deleted() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_Modified() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_LocalDate() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Activity_ActionLog() {
		return (EAttribute)prS_ActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ActivityResource() {
		return prS_ActivityResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ActivityTransaction() {
		return prS_ActivityTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Address() {
		return prS_AddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_AddressType() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Address1() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Address2() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Address3() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Address4() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_City() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Region() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_PostalCode() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_TimeZone() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Address_Country() {
		return (EAttribute)prS_AddressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_AddressLocation() {
		return prS_AddressLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Administrative() {
		return prS_AdministrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_ComplianceLevel() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_DocumentStatus() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_Distribution() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_Language() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_Copyright() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_Disclaimer() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Administrative_Rights() {
		return (EAttribute)prS_AdministrativeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_AdministrativeRevision() {
		return prS_AdministrativeRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Agreement() {
		return prS_AgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Agreement_ContractID() {
		return (EAttribute)prS_AgreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Agreement_AgreementType() {
		return (EAttribute)prS_AgreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Attachment() {
		return prS_AttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_AttachmentReference() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_Protocol() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_Format() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_AttachmentSize() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_AttachmentObject() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_AttachmentType() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Attachment_AttachmentName() {
		return (EAttribute)prS_AttachmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Category() {
		return prS_CategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Category_CategoryContents() {
		return (EAttribute)prS_CategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Category_CategoryType() {
		return (EAttribute)prS_CategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_CategoryParentChild() {
		return prS_CategoryParentChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Contact() {
		return prS_ContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ContactItem() {
		return prS_ContactItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ContactItemAddress() {
		return prS_ContactItemAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Expression() {
		return prS_ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Expression_Relation() {
		return (EAttribute)prS_ExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ExpressionLink() {
		return prS_ExpressionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_FeatureResource() {
		return prS_FeatureResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Organization() {
		return prS_OrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Organization_Name() {
		return (EAttribute)prS_OrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Organization_Business() {
		return (EAttribute)prS_OrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Person() {
		return prS_PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_FirstName() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_LastName() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_Salutation() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_Title() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_ContactType() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Person_CommunicationMode() {
		return (EAttribute)prS_PersonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Problem() {
		return prS_ProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Problem_Likelihood() {
		return (EAttribute)prS_ProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Problem_Impact() {
		return (EAttribute)prS_ProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ProductAsset() {
		return prS_ProductAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ProductComponent() {
		return prS_ProductComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ProductParentChild() {
		return prS_ProductParentChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Reference() {
		return prS_ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Resolution() {
		return prS_ResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPRS_Resolution_Confidence() {
		return (EAttribute)prS_ResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ResolutionResource() {
		return prS_ResolutionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_RevisionContact() {
		return prS_RevisionContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceActivity() {
		return prS_ServiceActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceAgreement() {
		return prS_ServiceAgreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceProblem() {
		return prS_ServiceProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceProvider() {
		return prS_ServiceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceRequester() {
		return prS_ServiceRequesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ServiceResolutionSolution() {
		return prS_ServiceResolutionSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionCategory() {
		return prS_SolutionCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionExpression() {
		return prS_SolutionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionHasElement() {
		return prS_SolutionHasElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionProblem() {
		return prS_SolutionProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionReference() {
		return prS_SolutionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SolutionResolution() {
		return prS_SolutionResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_StatementFeature() {
		return prS_StatementFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ActivityContact() {
		return prS_ActivityContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_AdminAssociation() {
		return prS_AdminAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_AdministrativeContact() {
		return prS_AdministrativeContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Attached() {
		return prS_AttachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_Categorization() {
		return prS_CategorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ContactContactItem() {
		return prS_ContactContactItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ContactOrganization() {
		return prS_ContactOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_ContactPerson() {
		return prS_ContactPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPRS_SISService() {
		return prS_SISServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction() {
		return prS_SISServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPRS_SISService__EndSISTransaction__Long_PRS_Transaction() {
		return prS_SISServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction() {
		return prS_SISServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrsFactory getPrsFactory() {
		return (PrsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		prS_ExchangeElementEClass = createEClass(PRS_EXCHANGE_ELEMENT);
		createEAttribute(prS_ExchangeElementEClass, PRS_EXCHANGE_ELEMENT__PRS_UNIQUE_NAME);
		createEAttribute(prS_ExchangeElementEClass, PRS_EXCHANGE_ELEMENT__DIRTY_FLAG);

		prS_ExpressionElementEClass = createEClass(PRS_EXPRESSION_ELEMENT);

		prS_FeatureEClass = createEClass(PRS_FEATURE);
		createEAttribute(prS_FeatureEClass, PRS_FEATURE__PROMPT);
		createEAttribute(prS_FeatureEClass, PRS_FEATURE__VALID_VALUES);
		createEAttribute(prS_FeatureEClass, PRS_FEATURE__DATA_TYPE);

		prS_LocationEClass = createEClass(PRS_LOCATION);
		createEAttribute(prS_LocationEClass, PRS_LOCATION__LOCATION_TYPE);
		createEAttribute(prS_LocationEClass, PRS_LOCATION__LOCATION_ID);

		prS_ProductEClass = createEClass(PRS_PRODUCT);
		createEAttribute(prS_ProductEClass, PRS_PRODUCT__VENDOR);
		createEAttribute(prS_ProductEClass, PRS_PRODUCT__PRODUCT_NAME);
		createEAttribute(prS_ProductEClass, PRS_PRODUCT__VERSION);
		createEAttribute(prS_ProductEClass, PRS_PRODUCT__ORDER);

		prS_ResourceEClass = createEClass(PRS_RESOURCE);
		createEAttribute(prS_ResourceEClass, PRS_RESOURCE__RESOURCE_TYPE);
		createEAttribute(prS_ResourceEClass, PRS_RESOURCE__QUANTITY);
		createEAttribute(prS_ResourceEClass, PRS_RESOURCE__UNITS);

		prS_RevisionEClass = createEClass(PRS_REVISION);
		createEAttribute(prS_RevisionEClass, PRS_REVISION__REVISION_DATE);
		createEAttribute(prS_RevisionEClass, PRS_REVISION__ACTIVITY_NAME);
		createEAttribute(prS_RevisionEClass, PRS_REVISION__ACTIVITY_TYPE);
		createEAttribute(prS_RevisionEClass, PRS_REVISION__TECHNICAL_STATUS);
		createEAttribute(prS_RevisionEClass, PRS_REVISION__EDITORIAL_STATUS);

		prS_ServiceIncidentEClass = createEClass(PRS_SERVICE_INCIDENT);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__REQUESTER_ID);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__PROVIDER_ID);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__CURRENT_STATE);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__REQUESTER_SEVERITY);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__PROVIDER_PRIORITY);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__RESPONSE_TIME);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__WORKFLOW_STATUS);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__COMMENT);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__ENTITLED);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__ACKNOWLEDGE);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__TRANSACTION_NAME);
		createEAttribute(prS_ServiceIncidentEClass, PRS_SERVICE_INCIDENT__LAST_TRANSACTION);

		prS_SolutionEClass = createEClass(PRS_SOLUTION);
		createEAttribute(prS_SolutionEClass, PRS_SOLUTION__TITLE);
		createEAttribute(prS_SolutionEClass, PRS_SOLUTION__SOLUTION_ABSTRACT);
		createEAttribute(prS_SolutionEClass, PRS_SOLUTION__SOLUTION_TYPE);

		prS_SolutionElementEClass = createEClass(PRS_SOLUTION_ELEMENT);

		prS_StatementEClass = createEClass(PRS_STATEMENT);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__STATEMENT_ROLE);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__TEXT);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__STATEMENT_OPERATOR);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__FEATURE_VALUE);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__ORDER);
		createEAttribute(prS_StatementEClass, PRS_STATEMENT__RELEVANCE);

		prS_TransactionEClass = createEClass(PRS_TRANSACTION);
		createEAttribute(prS_TransactionEClass, PRS_TRANSACTION__TRANSACTION_TYPE);
		createEAttribute(prS_TransactionEClass, PRS_TRANSACTION__TRANSACTION_STATE);
		createEAttribute(prS_TransactionEClass, PRS_TRANSACTION__COMPLETION_STATUS);

		prS_ActivityEClass = createEClass(PRS_ACTIVITY);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__PARAMETER_LIST);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__NEW_KEYS);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__DELETED);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__MODIFIED);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__LOCAL_DATE);
		createEAttribute(prS_ActivityEClass, PRS_ACTIVITY__ACTION_LOG);

		prS_ActivityResourceEClass = createEClass(PRS_ACTIVITY_RESOURCE);

		prS_ActivityTransactionEClass = createEClass(PRS_ACTIVITY_TRANSACTION);

		prS_AddressEClass = createEClass(PRS_ADDRESS);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__ADDRESS_TYPE);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__ADDRESS1);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__ADDRESS2);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__ADDRESS3);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__ADDRESS4);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__CITY);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__REGION);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__POSTAL_CODE);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__TIME_ZONE);
		createEAttribute(prS_AddressEClass, PRS_ADDRESS__COUNTRY);

		prS_AddressLocationEClass = createEClass(PRS_ADDRESS_LOCATION);

		prS_AdministrativeEClass = createEClass(PRS_ADMINISTRATIVE);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__COMPLIANCE_LEVEL);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__DOCUMENT_STATUS);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__DISTRIBUTION);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__LANGUAGE);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__COPYRIGHT);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__DISCLAIMER);
		createEAttribute(prS_AdministrativeEClass, PRS_ADMINISTRATIVE__RIGHTS);

		prS_AdministrativeRevisionEClass = createEClass(PRS_ADMINISTRATIVE_REVISION);

		prS_AgreementEClass = createEClass(PRS_AGREEMENT);
		createEAttribute(prS_AgreementEClass, PRS_AGREEMENT__CONTRACT_ID);
		createEAttribute(prS_AgreementEClass, PRS_AGREEMENT__AGREEMENT_TYPE);

		prS_AttachmentEClass = createEClass(PRS_ATTACHMENT);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__ATTACHMENT_REFERENCE);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__PROTOCOL);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__FORMAT);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__ATTACHMENT_SIZE);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__ATTACHMENT_OBJECT);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__ATTACHMENT_TYPE);
		createEAttribute(prS_AttachmentEClass, PRS_ATTACHMENT__ATTACHMENT_NAME);

		prS_CategoryEClass = createEClass(PRS_CATEGORY);
		createEAttribute(prS_CategoryEClass, PRS_CATEGORY__CATEGORY_CONTENTS);
		createEAttribute(prS_CategoryEClass, PRS_CATEGORY__CATEGORY_TYPE);

		prS_CategoryParentChildEClass = createEClass(PRS_CATEGORY_PARENT_CHILD);

		prS_ContactEClass = createEClass(PRS_CONTACT);

		prS_ContactItemEClass = createEClass(PRS_CONTACT_ITEM);

		prS_ContactItemAddressEClass = createEClass(PRS_CONTACT_ITEM_ADDRESS);

		prS_ExpressionEClass = createEClass(PRS_EXPRESSION);
		createEAttribute(prS_ExpressionEClass, PRS_EXPRESSION__RELATION);

		prS_ExpressionLinkEClass = createEClass(PRS_EXPRESSION_LINK);

		prS_FeatureResourceEClass = createEClass(PRS_FEATURE_RESOURCE);

		prS_OrganizationEClass = createEClass(PRS_ORGANIZATION);
		createEAttribute(prS_OrganizationEClass, PRS_ORGANIZATION__NAME);
		createEAttribute(prS_OrganizationEClass, PRS_ORGANIZATION__BUSINESS);

		prS_PersonEClass = createEClass(PRS_PERSON);
		createEAttribute(prS_PersonEClass, PRS_PERSON__FIRST_NAME);
		createEAttribute(prS_PersonEClass, PRS_PERSON__LAST_NAME);
		createEAttribute(prS_PersonEClass, PRS_PERSON__SALUTATION);
		createEAttribute(prS_PersonEClass, PRS_PERSON__TITLE);
		createEAttribute(prS_PersonEClass, PRS_PERSON__CONTACT_TYPE);
		createEAttribute(prS_PersonEClass, PRS_PERSON__COMMUNICATION_MODE);

		prS_ProblemEClass = createEClass(PRS_PROBLEM);
		createEAttribute(prS_ProblemEClass, PRS_PROBLEM__LIKELIHOOD);
		createEAttribute(prS_ProblemEClass, PRS_PROBLEM__IMPACT);

		prS_ProductAssetEClass = createEClass(PRS_PRODUCT_ASSET);

		prS_ProductComponentEClass = createEClass(PRS_PRODUCT_COMPONENT);

		prS_ProductParentChildEClass = createEClass(PRS_PRODUCT_PARENT_CHILD);

		prS_ReferenceEClass = createEClass(PRS_REFERENCE);

		prS_ResolutionEClass = createEClass(PRS_RESOLUTION);
		createEAttribute(prS_ResolutionEClass, PRS_RESOLUTION__CONFIDENCE);

		prS_ResolutionResourceEClass = createEClass(PRS_RESOLUTION_RESOURCE);

		prS_RevisionContactEClass = createEClass(PRS_REVISION_CONTACT);

		prS_ServiceActivityEClass = createEClass(PRS_SERVICE_ACTIVITY);

		prS_ServiceAgreementEClass = createEClass(PRS_SERVICE_AGREEMENT);

		prS_ServiceProblemEClass = createEClass(PRS_SERVICE_PROBLEM);

		prS_ServiceProviderEClass = createEClass(PRS_SERVICE_PROVIDER);

		prS_ServiceRequesterEClass = createEClass(PRS_SERVICE_REQUESTER);

		prS_ServiceResolutionSolutionEClass = createEClass(PRS_SERVICE_RESOLUTION_SOLUTION);

		prS_SolutionCategoryEClass = createEClass(PRS_SOLUTION_CATEGORY);

		prS_SolutionExpressionEClass = createEClass(PRS_SOLUTION_EXPRESSION);

		prS_SolutionHasElementEClass = createEClass(PRS_SOLUTION_HAS_ELEMENT);

		prS_SolutionProblemEClass = createEClass(PRS_SOLUTION_PROBLEM);

		prS_SolutionReferenceEClass = createEClass(PRS_SOLUTION_REFERENCE);

		prS_SolutionResolutionEClass = createEClass(PRS_SOLUTION_RESOLUTION);

		prS_StatementFeatureEClass = createEClass(PRS_STATEMENT_FEATURE);

		prS_ActivityContactEClass = createEClass(PRS_ACTIVITY_CONTACT);

		prS_AdminAssociationEClass = createEClass(PRS_ADMIN_ASSOCIATION);

		prS_AdministrativeContactEClass = createEClass(PRS_ADMINISTRATIVE_CONTACT);

		prS_AttachedEClass = createEClass(PRS_ATTACHED);

		prS_CategorizationEClass = createEClass(PRS_CATEGORIZATION);

		prS_ContactContactItemEClass = createEClass(PRS_CONTACT_CONTACT_ITEM);

		prS_ContactOrganizationEClass = createEClass(PRS_CONTACT_ORGANIZATION);

		prS_ContactPersonEClass = createEClass(PRS_CONTACT_PERSON);

		prS_SISServiceEClass = createEClass(PRS_SIS_SERVICE);
		createEOperation(prS_SISServiceEClass, PRS_SIS_SERVICE___START_SIS_TRANSACTION__INTEGER_PRS_ACTIVITY_PRS_TRANSACTION);
		createEOperation(prS_SISServiceEClass, PRS_SIS_SERVICE___END_SIS_TRANSACTION__LONG_PRS_TRANSACTION);
		createEOperation(prS_SISServiceEClass, PRS_SIS_SERVICE___SET_SIS_COMPLETION_STATUS__LONG_PRS_TRANSACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CimPackage theCimPackage = (CimPackage)EPackage.Registry.INSTANCE.getEPackage(CimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		prS_ExchangeElementEClass.getESuperTypes().add(theCimPackage.getCIM_ManagedElement());
		prS_ExpressionElementEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_FeatureEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_LocationEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ProductEClass.getESuperTypes().add(this.getPRS_ExpressionElement());
		prS_ResourceEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_RevisionEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ServiceIncidentEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_SolutionEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_SolutionElementEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_StatementEClass.getESuperTypes().add(this.getPRS_ExpressionElement());
		prS_TransactionEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ActivityEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ActivityResourceEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ActivityTransactionEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_AddressEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_AddressLocationEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_AdministrativeEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_AdministrativeRevisionEClass.getESuperTypes().add(theCimPackage.getCIM_HostedDependency());
		prS_AgreementEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_AttachmentEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_CategoryEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_CategoryParentChildEClass.getESuperTypes().add(theCimPackage.getCIM_HostedDependency());
		prS_ContactEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ContactItemEClass.getESuperTypes().add(this.getPRS_ExchangeElement());
		prS_ContactItemAddressEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ExpressionEClass.getESuperTypes().add(this.getPRS_ExpressionElement());
		prS_ExpressionLinkEClass.getESuperTypes().add(theCimPackage.getCIM_HostedDependency());
		prS_FeatureResourceEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_OrganizationEClass.getESuperTypes().add(this.getPRS_ContactItem());
		prS_PersonEClass.getESuperTypes().add(this.getPRS_ContactItem());
		prS_ProblemEClass.getESuperTypes().add(this.getPRS_SolutionElement());
		prS_ProductAssetEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ProductComponentEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ProductParentChildEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ReferenceEClass.getESuperTypes().add(this.getPRS_SolutionElement());
		prS_ResolutionEClass.getESuperTypes().add(this.getPRS_SolutionElement());
		prS_ResolutionResourceEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_RevisionContactEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceActivityEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceAgreementEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceProblemEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceProviderEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceRequesterEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ServiceResolutionSolutionEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_SolutionCategoryEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_SolutionExpressionEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_SolutionHasElementEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_SolutionProblemEClass.getESuperTypes().add(this.getPRS_SolutionHasElement());
		prS_SolutionReferenceEClass.getESuperTypes().add(this.getPRS_SolutionHasElement());
		prS_SolutionResolutionEClass.getESuperTypes().add(this.getPRS_SolutionHasElement());
		prS_StatementFeatureEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ActivityContactEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_AdminAssociationEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_AdministrativeContactEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_AttachedEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_CategorizationEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ContactContactItemEClass.getESuperTypes().add(theCimPackage.getCIM_Dependency());
		prS_ContactOrganizationEClass.getESuperTypes().add(this.getPRS_ContactContactItem());
		prS_ContactPersonEClass.getESuperTypes().add(this.getPRS_ContactContactItem());
		prS_SISServiceEClass.getESuperTypes().add(theCimPackage.getCIM_Service());

		// Initialize classes, features, and operations; add parameters
		initEClass(prS_ExchangeElementEClass, PRS_ExchangeElement.class, "PRS_ExchangeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_ExchangeElement_PRSUniqueName(), ecorePackage.getEString(), "PRSUniqueName", null, 0, 1, PRS_ExchangeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ExchangeElement_DirtyFlag(), ecorePackage.getEIntegerObject(), "DirtyFlag", null, 0, 1, PRS_ExchangeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ExpressionElementEClass, PRS_ExpressionElement.class, "PRS_ExpressionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_FeatureEClass, PRS_Feature.class, "PRS_Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Feature_Prompt(), ecorePackage.getEString(), "Prompt", null, 0, 1, PRS_Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Feature_ValidValues(), ecorePackage.getEString(), "ValidValues", null, 0, 1, PRS_Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Feature_DataType(), ecorePackage.getEIntegerObject(), "DataType", null, 0, 1, PRS_Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_LocationEClass, PRS_Location.class, "PRS_Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Location_LocationType(), ecorePackage.getEIntegerObject(), "LocationType", null, 0, 1, PRS_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Location_LocationID(), ecorePackage.getEString(), "LocationID", null, 0, 1, PRS_Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ProductEClass, PRS_Product.class, "PRS_Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Product_Vendor(), ecorePackage.getEString(), "Vendor", null, 0, 1, PRS_Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Product_ProductName(), ecorePackage.getEString(), "ProductName", null, 0, 1, PRS_Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Product_Version(), ecorePackage.getEString(), "Version", null, 0, 1, PRS_Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Product_Order(), ecorePackage.getEString(), "Order", null, 0, 1, PRS_Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ResourceEClass, PRS_Resource.class, "PRS_Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Resource_ResourceType(), ecorePackage.getEString(), "ResourceType", null, 0, 1, PRS_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Resource_Quantity(), ecorePackage.getEIntegerObject(), "Quantity", null, 0, 1, PRS_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Resource_Units(), ecorePackage.getEString(), "Units", null, 0, 1, PRS_Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_RevisionEClass, PRS_Revision.class, "PRS_Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Revision_RevisionDate(), ecorePackage.getEString(), "RevisionDate", null, 0, 1, PRS_Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Revision_ActivityName(), ecorePackage.getEIntegerObject(), "ActivityName", null, 0, 1, PRS_Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Revision_ActivityType(), ecorePackage.getEIntegerObject(), "ActivityType", null, 0, 1, PRS_Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Revision_TechnicalStatus(), ecorePackage.getEIntegerObject(), "TechnicalStatus", null, 0, 1, PRS_Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Revision_EditorialStatus(), ecorePackage.getEIntegerObject(), "EditorialStatus", null, 0, 1, PRS_Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ServiceIncidentEClass, PRS_ServiceIncident.class, "PRS_ServiceIncident", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_ServiceIncident_RequesterID(), ecorePackage.getEString(), "RequesterID", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_ProviderID(), ecorePackage.getEString(), "ProviderID", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_CurrentState(), ecorePackage.getEIntegerObject(), "CurrentState", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_RequesterSeverity(), ecorePackage.getEIntegerObject(), "RequesterSeverity", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_ProviderPriority(), ecorePackage.getEIntegerObject(), "ProviderPriority", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_ResponseTime(), ecorePackage.getEString(), "ResponseTime", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_WorkflowStatus(), ecorePackage.getEString(), "WorkflowStatus", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_Comment(), ecorePackage.getEString(), "Comment", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_Entitled(), ecorePackage.getEIntegerObject(), "Entitled", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_Acknowledge(), ecorePackage.getEIntegerObject(), "Acknowledge", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_TransactionName(), ecorePackage.getEString(), "TransactionName", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_ServiceIncident_LastTransaction(), ecorePackage.getEIntegerObject(), "LastTransaction", null, 0, 1, PRS_ServiceIncident.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_SolutionEClass, PRS_Solution.class, "PRS_Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Solution_Title(), ecorePackage.getEString(), "Title", null, 0, 1, PRS_Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Solution_SolutionAbstract(), ecorePackage.getEString(), "SolutionAbstract", null, 0, 1, PRS_Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Solution_SolutionType(), ecorePackage.getEIntegerObject(), "SolutionType", null, 0, 1, PRS_Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_SolutionElementEClass, PRS_SolutionElement.class, "PRS_SolutionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_StatementEClass, PRS_Statement.class, "PRS_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Statement_StatementRole(), ecorePackage.getEIntegerObject(), "StatementRole", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Statement_Text(), ecorePackage.getEString(), "Text", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Statement_StatementOperator(), ecorePackage.getEString(), "StatementOperator", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Statement_FeatureValue(), ecorePackage.getEString(), "FeatureValue", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Statement_Order(), ecorePackage.getEString(), "Order", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Statement_Relevance(), ecorePackage.getEIntegerObject(), "Relevance", null, 0, 1, PRS_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_TransactionEClass, PRS_Transaction.class, "PRS_Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Transaction_TransactionType(), ecorePackage.getEIntegerObject(), "TransactionType", null, 0, 1, PRS_Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Transaction_TransactionState(), ecorePackage.getEIntegerObject(), "TransactionState", null, 0, 1, PRS_Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Transaction_CompletionStatus(), ecorePackage.getELongObject(), "CompletionStatus", null, 0, 1, PRS_Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ActivityEClass, PRS_Activity.class, "PRS_Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Activity_ParameterList(), ecorePackage.getEString(), "ParameterList", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Activity_NewKeys(), ecorePackage.getEString(), "NewKeys", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Activity_Deleted(), ecorePackage.getEString(), "Deleted", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Activity_Modified(), ecorePackage.getEString(), "Modified", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Activity_LocalDate(), ecorePackage.getEString(), "LocalDate", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Activity_ActionLog(), ecorePackage.getEString(), "ActionLog", null, 0, 1, PRS_Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ActivityResourceEClass, PRS_ActivityResource.class, "PRS_ActivityResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ActivityTransactionEClass, PRS_ActivityTransaction.class, "PRS_ActivityTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AddressEClass, PRS_Address.class, "PRS_Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Address_AddressType(), ecorePackage.getEIntegerObject(), "AddressType", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Address1(), ecorePackage.getEString(), "Address1", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Address2(), ecorePackage.getEString(), "Address2", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Address3(), ecorePackage.getEString(), "Address3", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Address4(), ecorePackage.getEString(), "Address4", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_City(), ecorePackage.getEString(), "City", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Region(), ecorePackage.getEString(), "Region", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_PostalCode(), ecorePackage.getEString(), "PostalCode", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_TimeZone(), ecorePackage.getEString(), "TimeZone", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Address_Country(), ecorePackage.getEString(), "Country", null, 0, 1, PRS_Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_AddressLocationEClass, PRS_AddressLocation.class, "PRS_AddressLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AdministrativeEClass, PRS_Administrative.class, "PRS_Administrative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Administrative_ComplianceLevel(), ecorePackage.getEIntegerObject(), "ComplianceLevel", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_DocumentStatus(), ecorePackage.getEIntegerObject(), "DocumentStatus", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_Distribution(), ecorePackage.getEIntegerObject(), "Distribution", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_Language(), ecorePackage.getEString(), "Language", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_Copyright(), ecorePackage.getEString(), "Copyright", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_Disclaimer(), ecorePackage.getEString(), "Disclaimer", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Administrative_Rights(), ecorePackage.getEString(), "Rights", null, 0, 1, PRS_Administrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_AdministrativeRevisionEClass, PRS_AdministrativeRevision.class, "PRS_AdministrativeRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AgreementEClass, PRS_Agreement.class, "PRS_Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Agreement_ContractID(), ecorePackage.getEString(), "ContractID", null, 0, 1, PRS_Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Agreement_AgreementType(), ecorePackage.getEString(), "AgreementType", null, 0, 1, PRS_Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_AttachmentEClass, PRS_Attachment.class, "PRS_Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Attachment_AttachmentReference(), ecorePackage.getEString(), "AttachmentReference", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_Protocol(), ecorePackage.getEString(), "Protocol", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_Format(), ecorePackage.getEString(), "Format", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_AttachmentSize(), ecorePackage.getEString(), "AttachmentSize", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_AttachmentObject(), ecorePackage.getEString(), "AttachmentObject", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_AttachmentType(), ecorePackage.getEIntegerObject(), "AttachmentType", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Attachment_AttachmentName(), ecorePackage.getEString(), "AttachmentName", null, 0, 1, PRS_Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_CategoryEClass, PRS_Category.class, "PRS_Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Category_CategoryContents(), ecorePackage.getEString(), "CategoryContents", null, 0, 1, PRS_Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Category_CategoryType(), ecorePackage.getEString(), "CategoryType", null, 0, 1, PRS_Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_CategoryParentChildEClass, PRS_CategoryParentChild.class, "PRS_CategoryParentChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactEClass, PRS_Contact.class, "PRS_Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactItemEClass, PRS_ContactItem.class, "PRS_ContactItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactItemAddressEClass, PRS_ContactItemAddress.class, "PRS_ContactItemAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ExpressionEClass, PRS_Expression.class, "PRS_Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Expression_Relation(), ecorePackage.getEString(), "Relation", null, 0, 1, PRS_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ExpressionLinkEClass, PRS_ExpressionLink.class, "PRS_ExpressionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_FeatureResourceEClass, PRS_FeatureResource.class, "PRS_FeatureResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_OrganizationEClass, PRS_Organization.class, "PRS_Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Organization_Name(), ecorePackage.getEString(), "Name", null, 0, 1, PRS_Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Organization_Business(), ecorePackage.getEString(), "Business", null, 0, 1, PRS_Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_PersonEClass, PRS_Person.class, "PRS_Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Person_FirstName(), ecorePackage.getEString(), "FirstName", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Person_LastName(), ecorePackage.getEString(), "LastName", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Person_Salutation(), ecorePackage.getEString(), "Salutation", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Person_Title(), ecorePackage.getEString(), "Title", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Person_ContactType(), ecorePackage.getEString(), "ContactType", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Person_CommunicationMode(), ecorePackage.getEIntegerObject(), "CommunicationMode", null, 0, 1, PRS_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ProblemEClass, PRS_Problem.class, "PRS_Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Problem_Likelihood(), ecorePackage.getEIntegerObject(), "Likelihood", null, 0, 1, PRS_Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRS_Problem_Impact(), ecorePackage.getEIntegerObject(), "Impact", null, 0, 1, PRS_Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ProductAssetEClass, PRS_ProductAsset.class, "PRS_ProductAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ProductComponentEClass, PRS_ProductComponent.class, "PRS_ProductComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ProductParentChildEClass, PRS_ProductParentChild.class, "PRS_ProductParentChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ReferenceEClass, PRS_Reference.class, "PRS_Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ResolutionEClass, PRS_Resolution.class, "PRS_Resolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRS_Resolution_Confidence(), ecorePackage.getEIntegerObject(), "Confidence", null, 0, 1, PRS_Resolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prS_ResolutionResourceEClass, PRS_ResolutionResource.class, "PRS_ResolutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_RevisionContactEClass, PRS_RevisionContact.class, "PRS_RevisionContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceActivityEClass, PRS_ServiceActivity.class, "PRS_ServiceActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceAgreementEClass, PRS_ServiceAgreement.class, "PRS_ServiceAgreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceProblemEClass, PRS_ServiceProblem.class, "PRS_ServiceProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceProviderEClass, PRS_ServiceProvider.class, "PRS_ServiceProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceRequesterEClass, PRS_ServiceRequester.class, "PRS_ServiceRequester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ServiceResolutionSolutionEClass, PRS_ServiceResolutionSolution.class, "PRS_ServiceResolutionSolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionCategoryEClass, PRS_SolutionCategory.class, "PRS_SolutionCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionExpressionEClass, PRS_SolutionExpression.class, "PRS_SolutionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionHasElementEClass, PRS_SolutionHasElement.class, "PRS_SolutionHasElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionProblemEClass, PRS_SolutionProblem.class, "PRS_SolutionProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionReferenceEClass, PRS_SolutionReference.class, "PRS_SolutionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SolutionResolutionEClass, PRS_SolutionResolution.class, "PRS_SolutionResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_StatementFeatureEClass, PRS_StatementFeature.class, "PRS_StatementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ActivityContactEClass, PRS_ActivityContact.class, "PRS_ActivityContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AdminAssociationEClass, PRS_AdminAssociation.class, "PRS_AdminAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AdministrativeContactEClass, PRS_AdministrativeContact.class, "PRS_AdministrativeContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_AttachedEClass, PRS_Attached.class, "PRS_Attached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_CategorizationEClass, PRS_Categorization.class, "PRS_Categorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactContactItemEClass, PRS_ContactContactItem.class, "PRS_ContactContactItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactOrganizationEClass, PRS_ContactOrganization.class, "PRS_ContactOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_ContactPersonEClass, PRS_ContactPerson.class, "PRS_ContactPerson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prS_SISServiceEClass, PRS_SISService.class, "PRS_SISService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction(), ecorePackage.getELongObject(), "StartSISTransaction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "TransactionType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPRS_Activity(), "ActivityRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPRS_Transaction(), "TransactionRef", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRS_SISService__EndSISTransaction__Long_PRS_Transaction(), ecorePackage.getELongObject(), "EndSISTransaction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELongObject(), "Status", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPRS_Transaction(), "TransactionRef", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction(), ecorePackage.getELongObject(), "SetSISCompletionStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELongObject(), "CompletionStatus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPRS_Transaction(), "TransactionRef", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://schemas.dmtf.org/wbem/cim
		createCimAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelName", "Cim",
			   "basePackage", "org.dmtf",
			   "complianceLevel", "21.0",
			   "oSGiCompatible", "true",
			   "adapterFactory", "false",
			   "copyrightText", "Copyright (c) 2026 Contributors to the Eclipse Foundation.\n\nThis program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n  Data In Motion Consulting - initial implementation"
		   });
		addAnnotation
		  (prS_ExchangeElementEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ExchangeElement is an abstract base class for all classes in the Solution and Service Incident object model. As an abstract class it is never instantiated. \n\nPRS_ExchangeElement exists to provide a single anchor point for associations that may be made to any Solution or Service Incident object. For example, Administrative or Attachment instances may be associated with any object derived from PRS_ExchangeElement. To support this generic association capability, the PRS_AdminAssociation and PRS_Attached associations both derive from the CIM_Dependency association and override the Antecedent property of that class to be a PRS_ExchangeElement REF."
		   });
		addAnnotation
		  (getPRS_ExchangeElement_PRSUniqueName(),
		   source,
		   new String[] {
			   "documentation", "The PRSUniqueName property is a Globally Unique IDentifier (GUID) also known as a Universally Unique IDentifier (UUID). This property allows Solution and Service Incident objects to be used by multiple Solutions or Service Incidents without duplication. In addition, all Solution or Service Incidents containing a unique object are updated when the object is updated."
		   });
		addAnnotation
		  (getPRS_ExchangeElement_DirtyFlag(),
		   source,
		   new String[] {
			   "documentation", "The DirtyFlag is used by the SISService Start Transaction method to determine whether an ExchangeElement has been created, modified or deleted since the last Transaction. Any object not marked \'Clean\' is included in the next Transaction. \n\nIt is the responsibility of the entity creating, modifying or deleting the object derived from ExchangeElement to set this property appropriately. \n\nThis property value is set to \'Clean\' by an invocation of the Transaction Complete method with a Status parameter of zero (0)."
		   });
		addAnnotation
		  (prS_ExpressionElementEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ExpressionElement is an abstract base class for PRS_Products and PRS_Statements. It provides a common association point for objects associated with PRS_Expressions."
		   });
		addAnnotation
		  (prS_FeatureEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Feature is used for structured diagnostic data, including specific data values like steps or conditions. For example, consider a PRS_Statement with a Text property value of: \nPrint jobs per day are less than 50 \n\nThis could be described using a PRS_Feature as follows: \nDescription: \'Print jobs per day\' \nPrompt: \'How many print jobs per day?\' \nValidValues: \'10\' \'50\' \'100\' \nDataType: \'Integer\' \n\nThe associated PRS_Statement would contain: \nOperator: \'<\' \nFeatureValue: \'50\'"
		   });
		addAnnotation
		  (getPRS_Feature_Prompt(),
		   source,
		   new String[] {
			   "documentation", "Prompt presented through user interface."
		   });
		addAnnotation
		  (getPRS_Feature_ValidValues(),
		   source,
		   new String[] {
			   "documentation", "Valid values for this PRS_Feature."
		   });
		addAnnotation
		  (getPRS_Feature_DataType(),
		   source,
		   new String[] {
			   "documentation", "Data type used for PRS_Statement FeatureValue property."
		   });
		addAnnotation
		  (prS_LocationEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Location describes the location of a PRS_Address."
		   });
		addAnnotation
		  (getPRS_Location_LocationType(),
		   source,
		   new String[] {
			   "documentation", "The type of location."
		   });
		addAnnotation
		  (getPRS_Location_LocationID(),
		   source,
		   new String[] {
			   "documentation", "The specific location."
		   });
		addAnnotation
		  (prS_ProductEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Product is used to describe a single product to associate with a PRS_Expression."
		   });
		addAnnotation
		  (getPRS_Product_Vendor(),
		   source,
		   new String[] {
			   "documentation", "The vendor of the product."
		   });
		addAnnotation
		  (getPRS_Product_ProductName(),
		   source,
		   new String[] {
			   "documentation", "The make and or model of the product."
		   });
		addAnnotation
		  (getPRS_Product_Version(),
		   source,
		   new String[] {
			   "documentation", "The version of the product."
		   });
		addAnnotation
		  (getPRS_Product_Order(),
		   source,
		   new String[] {
			   "documentation", "The order of relevance of this product to an associated PRS_SolutionElement (which includes PRS_Reference, PRS_Problem or PRS_Resolution)."
		   });
		addAnnotation
		  (prS_ResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Each PRS_Resolution may have an associated cost of implementation. This cost may have several components such as time, material costs, labor cost, etc. To capture these costs, a PRS_Resouce is associated with a PRS_Resolution. For Service Incidents, one or more PRS_Resource objects may be associated with an Activity."
		   });
		addAnnotation
		  (getPRS_Resource_ResourceType(),
		   source,
		   new String[] {
			   "documentation", "A string describing the type of resource."
		   });
		addAnnotation
		  (getPRS_Resource_Quantity(),
		   source,
		   new String[] {
			   "documentation", "Number of units of resource used."
		   });
		addAnnotation
		  (getPRS_Resource_Units(),
		   source,
		   new String[] {
			   "documentation", "Unit of measure for this resource."
		   });
		addAnnotation
		  (prS_RevisionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Revision records changes to the content."
		   });
		addAnnotation
		  (getPRS_Revision_RevisionDate(),
		   source,
		   new String[] {
			   "documentation", "The date of this revision."
		   });
		addAnnotation
		  (getPRS_Revision_ActivityName(),
		   source,
		   new String[] {
			   "documentation", "The name of the specific revision being made."
		   });
		addAnnotation
		  (getPRS_Revision_ActivityType(),
		   source,
		   new String[] {
			   "documentation", "Type of revision activity. \'Technical\' refers to a change in content. \'Editorial\' refers to a change in language or style. \'Administrative\' refers to information about the object."
		   });
		addAnnotation
		  (getPRS_Revision_TechnicalStatus(),
		   source,
		   new String[] {
			   "documentation", "The current state of technical review. \'Open\' means created but not necessarily completed or resolved. \'Not Reviewed\' means contents have to be reviewed for accuracy and consistency with other content. \'Reviewed\' means review has been completed. \'Approved\' means formally approval to certify the solution given the specific status of the contents."
		   });
		addAnnotation
		  (getPRS_Revision_EditorialStatus(),
		   source,
		   new String[] {
			   "documentation", "The current state of editorial review. \'In Progress\' means the content is in the process of being developed. \'Draft\' means the content is complete but unedited. \'Reviewed\' means the review has been completed. \'Published\' means the contents have been released."
		   });
		addAnnotation
		  (prS_ServiceIncidentEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ServiceIncident contains the fundamental information related to a specific incident: its identity, status, priority, etc. The actual incident data, including specific transactions and resolution information, is contained in the objects associated with PRS_ServiceIncident. These include specific Problem, Resolution and Activity related objects accrued through the Transaction workflow."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_RequesterID(),
		   source,
		   new String[] {
			   "documentation", "The unique identifier for this incident assigned by the Requester."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ProviderID(),
		   source,
		   new String[] {
			   "documentation", "The unique identifier for this incident assigned by the Provider."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_CurrentState(),
		   source,
		   new String[] {
			   "documentation", "The state of the incident within the Service Incident Exchange Standard transaction model."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_RequesterSeverity(),
		   source,
		   new String[] {
			   "documentation", "The severity of the incident as defined by the Requester. One is the most severe and five is the least severe."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ProviderPriority(),
		   source,
		   new String[] {
			   "documentation", "The priority of the incident as defined by the Requester. One is the highest priority and five is the lowest priority."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ResponseTime(),
		   source,
		   new String[] {
			   "documentation", "The explicit time the Requester expects a response."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_WorkflowStatus(),
		   source,
		   new String[] {
			   "documentation", "Status of the incident according to the workflow."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Comment(),
		   source,
		   new String[] {
			   "documentation", "Additional general information about the incident."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Entitled(),
		   source,
		   new String[] {
			   "documentation", "Is the Requester entitled to service or not?"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Acknowledge(),
		   source,
		   new String[] {
			   "documentation", "Was the last transaction was accepted or rejected?"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_TransactionName(),
		   source,
		   new String[] {
			   "documentation", "The use of the TransactionName property is deprecated. New Service Incidents should use the LastTransaction property and set this property to NULL."
		   });
		addAnnotation
		  (getPRS_ServiceIncident_LastTransaction(),
		   source,
		   new String[] {
			   "documentation", "The name of the last transaction which was acknowledged."
		   });
		addAnnotation
		  (prS_SolutionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Solution is the root class of a set of associated classes used to describe a single Solution. If a Solution is associated with multiple Problems or Resolutions, all of the Problems described are related to all of the Resolutions described. The reverse is also true. All of the Resolutions described are related to all of the Problems described in the Solution. \n\nPRS_Solution is directly associated to one or more of the following classes: \nPRS_Reference \nPRS_Problem \nPRS_Resolution. "
		   });
		addAnnotation
		  (getPRS_Solution_Title(),
		   source,
		   new String[] {
			   "documentation", "The Solution title."
		   });
		addAnnotation
		  (getPRS_Solution_SolutionAbstract(),
		   source,
		   new String[] {
			   "documentation", "A brief description of the Solution."
		   });
		addAnnotation
		  (getPRS_Solution_SolutionType(),
		   source,
		   new String[] {
			   "documentation", "The SolutionType suggests the type of knowledge contained in the Solution. Depending on the type, the Solution may or may not include particular objects. For example, a \'Reference\' Solution describes non-diagnostic technical or general information using PRS_Statement objects. A \'Diagnostic\' Solution includes one or more PRS_Problem and PRS_Resolution objects. A \'How To\' Solution describes how to solve a particular Problem described by a PRS_Problem in a series of sequential steps within a PRS_Resolution."
		   });
		addAnnotation
		  (prS_SolutionElementEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionElement is an abstract base class for non-Category objects that are associated with a Solution. This includes: \nPRS_Reference \nPRS_Problem \nPRS_Resolution \n\nPRS_SolutionElement provides a common reference for these objects to be associated with PRS_Expression objects through the SolutionExpression association. \n\nIn addition, all of the derived objects may be retrieved with a single query for the common super-class."
		   });
		addAnnotation
		  (prS_StatementEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Statement contains the text describing a problem, any relevant background information, and its resolution. Statements are units of text ranging from brief sentences or phrases to paragraphs or pages. There is no limit to the number of PRS_Statements within a Solution, as long as they support the intent and focus of their root class. Root classes include: PRS_Reference, PRS_Problem or PRS_Resolution. \n\nPRS_Statements may be grouped together to build compound \'sentences\'. For example, \nStatementA = Printer output is blotchy. \nStatementB = Print jobs per day are less than 50. \nExpressionA = StatementA AND StatementB."
		   });
		addAnnotation
		  (getPRS_Statement_StatementRole(),
		   source,
		   new String[] {
			   "documentation", "StatementRole describes how the PRS_Statement relates to the larger context. For example, is the PRS_Statement describing a Fix or a Symptom? \'Description\' is generic text without a specific diagnostic application. \'Symptom\' describes initial observable incident or behavior that the user reports. \'Error_Message\' is a specific type of symptom that the user reports, describing the specific error condition. \'Objective\' is what the user wants to accomplish, often expressed as a positive condition. FOr example, how to print on a network. \'Evidence\' is information that is collected to diagnose the problem after the symptom is reported. \'Cause\' is a description of the underlying facts or factors that engender or relate this behavior. \'Work_around\' is information that lets the user work, but does not correct the problem completely. \'Fix\' is information that fixes the problem completely. \'Answer\' is the information given to the user such as steps to perform, wording to support their environment and understanding. \'Keyword\' is a specific classification using defined words or phrases. \'Changes\' describe recent changes in the environment which could affect the problem or resolution. \'Title\' is the title applying to associated PRS_Statements (usually associated via an \'and\' expression."
		   });
		addAnnotation
		  (getPRS_Statement_Text(),
		   source,
		   new String[] {
			   "documentation", "The descriptive text used for the PRS_Statement."
		   });
		addAnnotation
		  (getPRS_Statement_StatementOperator(),
		   source,
		   new String[] {
			   "documentation", "When the PRS_Adminstrative object indicates Level 2 compliance, StatementOperator describes the relationship between an associated PRS_Feature and the FeatureValue property. This property is ignored if there is no PRS_Feature associated with this PRS_Statement."
		   });
		addAnnotation
		  (getPRS_Statement_FeatureValue(),
		   source,
		   new String[] {
			   "documentation", "When the PRS_Adminstrative object indicates Level 2 compliance, FeatureValue is the specific value selected from the associated PRS_Feature. This property is ignored if there is no PRS_Feature associated with this PRS_Statement."
		   });
		addAnnotation
		  (getPRS_Statement_Order(),
		   source,
		   new String[] {
			   "documentation", "Order is used to sequence PRS_Statements associated with a single PRS_Expression to allow a Consumer to process the information in the order desired by the Producer."
		   });
		addAnnotation
		  (getPRS_Statement_Relevance(),
		   source,
		   new String[] {
			   "documentation", "Importance of this Statement. The value of this property shall be an integer value in the range of 0 to 100, inclusive."
		   });
		addAnnotation
		  (prS_TransactionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Transaction represents a single transaction of the Service Incident workflow. A PRS_Transaction instance is created by the PRS_SISService StartSISTransaction method."
		   });
		addAnnotation
		  (getPRS_Transaction_TransactionType(),
		   source,
		   new String[] {
			   "documentation", "The specific SIS transaction represented by this PRS_Transaction instance."
		   });
		addAnnotation
		  (getPRS_Transaction_TransactionState(),
		   source,
		   new String[] {
			   "documentation", "The current state of this transaction. This value is manipulated by the PRS_SISService:StartSISTransaction and SetSISCompletionStatus method implementations. This property is not intended to be written by management applications."
		   });
		addAnnotation
		  (getPRS_Transaction_CompletionStatus(),
		   source,
		   new String[] {
			   "documentation", "The status of the transaction after it has reached the \'Closed\' state. A CompletionStatus of zero (0) means the tranasaction completed successfully. A non-zero CompletionStatus indicates the transaction did not complete successfully. Non-zero values are implementation-specific. While the transaction is \'Open\' or \'Working\' the CompletionStatus property shall be zero (0). See the description for PRS_SISService for the definition of the contents of this property."
		   });
		addAnnotation
		  (prS_ActivityEClass,
		   source,
		   new String[] {
			   "documentation", "Describes the date of each transaction and the objects involved."
		   });
		addAnnotation
		  (getPRS_Activity_ParameterList(),
		   source,
		   new String[] {
			   "documentation", "The key fields for the objects in the associated Transaction. The use of this property is deprecated. The PRS_SISService StartSISTransaction method uses the New, Modified and Deleted properties instead of this field. This field is set to NULL by the StartSISTransaction method if the other properties are used."
		   });
		addAnnotation
		  (getPRS_Activity_NewKeys(),
		   source,
		   new String[] {
			   "documentation", "The key fields for the objects added in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method."
		   });
		addAnnotation
		  (getPRS_Activity_Deleted(),
		   source,
		   new String[] {
			   "documentation", "The key fields for objects deleted in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method."
		   });
		addAnnotation
		  (getPRS_Activity_Modified(),
		   source,
		   new String[] {
			   "documentation", "The key fields for objects modified in the associated Transaction. This property is set by the PRS_SISService StartSISTransaction method."
		   });
		addAnnotation
		  (getPRS_Activity_LocalDate(),
		   source,
		   new String[] {
			   "documentation", "The date of the Activity. This property is set by the PRS_SISService StartSISTranasaction method."
		   });
		addAnnotation
		  (getPRS_Activity_ActionLog(),
		   source,
		   new String[] {
			   "documentation", "Description of the activity performed."
		   });
		addAnnotation
		  (prS_ActivityResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Activity with PRS_Resource."
		   });
		addAnnotation
		  (prS_ActivityTransactionEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Activity with PRS_Transaction."
		   });
		addAnnotation
		  (prS_AddressEClass,
		   source,
		   new String[] {
			   "documentation", "Provides address information for PRS_ContactItem."
		   });
		addAnnotation
		  (getPRS_Address_AddressType(),
		   source,
		   new String[] {
			   "documentation", "The type of address."
		   });
		addAnnotation
		  (getPRS_Address_Address1(),
		   source,
		   new String[] {
			   "documentation", "First line of address information."
		   });
		addAnnotation
		  (getPRS_Address_Address2(),
		   source,
		   new String[] {
			   "documentation", "Second line of address information."
		   });
		addAnnotation
		  (getPRS_Address_Address3(),
		   source,
		   new String[] {
			   "documentation", "Third line of address information."
		   });
		addAnnotation
		  (getPRS_Address_Address4(),
		   source,
		   new String[] {
			   "documentation", "Fourth line of address information."
		   });
		addAnnotation
		  (getPRS_Address_City(),
		   source,
		   new String[] {
			   "documentation", "The city."
		   });
		addAnnotation
		  (getPRS_Address_Region(),
		   source,
		   new String[] {
			   "documentation", "The specific region, such as state or province."
		   });
		addAnnotation
		  (getPRS_Address_PostalCode(),
		   source,
		   new String[] {
			   "documentation", "The country\'s postal code for the address."
		   });
		addAnnotation
		  (getPRS_Address_TimeZone(),
		   source,
		   new String[] {
			   "documentation", "The time zone of the address."
		   });
		addAnnotation
		  (getPRS_Address_Country(),
		   source,
		   new String[] {
			   "documentation", "The country code, based on ISO/IEC 3166."
		   });
		addAnnotation
		  (prS_AddressLocationEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Address and PRS_Location."
		   });
		addAnnotation
		  (prS_AdministrativeEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Administrative defines administrative information about associated objects. There must be at least one PRS_Administrative instance associated with a PRS_Solution. Administrative information is inherited from a parent object. \n\nIf the administrative information among objects within a Solution is not the same, additional PRS_Administrative instances may be associated with other objects within the Solution. All instances under a specific parent inherit their administrative information unless there is an PRS_Administrative instance associated with that instance. \n\nFor example, if there is a PRS_Administrative instance associated with a PRS_Problem instance, all of the PRS_Statement and PRS_ Product instances within the Problem use the same Administrative information as the PRS_Problem instance."
		   });
		addAnnotation
		  (getPRS_Administrative_ComplianceLevel(),
		   source,
		   new String[] {
			   "documentation", "Level 0 means all information within a Reference, Problem or Resolution is conveyed by a single PRS_Statement. \n\nLevel 1 means there may be multiple PRS_Statement instances within a Reference, Problem or Resolution. \n\nLevel 2 means that a PRS_Statement may be associated with a PRS_Feature instance within a Reference, Problem or Resolution."
		   });
		addAnnotation
		  (getPRS_Administrative_DocumentStatus(),
		   source,
		   new String[] {
			   "documentation", "Editorial status of the document. If \'Draft\', information is complete, but unedited. If \'Reviewed\', an editorial review has been completed. If \'Published\', information has been reviewed and approved for distribution."
		   });
		addAnnotation
		  (getPRS_Administrative_Distribution(),
		   source,
		   new String[] {
			   "documentation", "Intended distribution audience for the associated information. If \'Proprietary\', information contains proprietary information and is not to be released externally. If \'Internal\', information is for internal use only. If \'Partner\', information is only available to contracted partners. If \'Public\', information is available to anyone."
		   });
		addAnnotation
		  (getPRS_Administrative_Language(),
		   source,
		   new String[] {
			   "documentation", "Language used in the associated information."
		   });
		addAnnotation
		  (getPRS_Administrative_Copyright(),
		   source,
		   new String[] {
			   "documentation", "Copyright for the associated information."
		   });
		addAnnotation
		  (getPRS_Administrative_Disclaimer(),
		   source,
		   new String[] {
			   "documentation", "Disclaimers about the associated information."
		   });
		addAnnotation
		  (getPRS_Administrative_Rights(),
		   source,
		   new String[] {
			   "documentation", "Usage rights for the associated information."
		   });
		addAnnotation
		  (prS_AdministrativeRevisionEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Administrative with PRS_Revision."
		   });
		addAnnotation
		  (prS_AgreementEClass,
		   source,
		   new String[] {
			   "documentation", "The agreement or contract referenced for entitlement to service."
		   });
		addAnnotation
		  (getPRS_Agreement_ContractID(),
		   source,
		   new String[] {
			   "documentation", "The identifier for the contract between the Request and the Provider. This property is set by the Requester prior to submitting a Service Request."
		   });
		addAnnotation
		  (getPRS_Agreement_AgreementType(),
		   source,
		   new String[] {
			   "documentation", "A brief description of the contract."
		   });
		addAnnotation
		  (prS_AttachmentEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Attachment describes file attachments. A PRS_Attachment may be associated to any object derived from PRS_ExchangeElement. PRS_Attachment is used to attach objects of any type including binary files, ASCII documents, or URLs. Only one object may be attached per PRS_Attachment. \n\nThe actual attachment carried by the Attachment object is included by one of two methods: by reference or by value as embedded data. A \'by reference\' approach links indirectly to the attachment through the use of a string identifier, e.g. a file name. An \'embedded data\' approach means the actual binary data is included in PRS_Attachment."
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentReference(),
		   source,
		   new String[] {
			   "documentation", "If the attachment is not embedded, where the attachment is located."
		   });
		addAnnotation
		  (getPRS_Attachment_Protocol(),
		   source,
		   new String[] {
			   "documentation", "Protocol required to read the attachment (e.g., http)."
		   });
		addAnnotation
		  (getPRS_Attachment_Format(),
		   source,
		   new String[] {
			   "documentation", "The file format of the attachment."
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentSize(),
		   source,
		   new String[] {
			   "documentation", "The size of the attachment in bytes."
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentObject(),
		   source,
		   new String[] {
			   "documentation", "The attachment itself, if embedded."
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentType(),
		   source,
		   new String[] {
			   "documentation", "The purpose of the attachment, as related to the diagnosis. \'Instructions\' are compilable code. \'Background\' is descriptive information. \'Log\' is information captured in a log file."
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentName(),
		   source,
		   new String[] {
			   "documentation", "The displayable attachment identifier. Used to define what will appear as the name of the attachment, as opposed to the specific attachment file name or URL."
		   });
		addAnnotation
		  (prS_CategoryEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Category is used to classify the components of a Solution. Hierarchical classifications are created by associating PRS_CategoryParentChild with multiple PRS_Category instances."
		   });
		addAnnotation
		  (getPRS_Category_CategoryContents(),
		   source,
		   new String[] {
			   "documentation", "The specific value for the category. For example, \'HP Laserjet\' would be a value for a category containing printer names."
		   });
		addAnnotation
		  (getPRS_Category_CategoryType(),
		   source,
		   new String[] {
			   "documentation", "The type of category. Used to give additional semantics to the category. For example, a Category of Type \'Printers\' would qualify the list of category values for a list of printers. \n\nNote: the relationship of Category Type to Category Value expresses no intrinsic hierarchy. If a tree of relationships exists to define categories and sub-categories, this should be defined using CategoryParentChild associations."
		   });
		addAnnotation
		  (prS_CategoryParentChildEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_CategoryParentChild is used to define classification hierarchies."
		   });
		addAnnotation
		  (prS_ContactEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Contact is used to anchor associations to PRS_Person and PRS_Orgnaization. PRS_Contact is also used to anchor associations to PRS_Revision and PRS_Resolution, as well as PRS_ServiceIncident."
		   });
		addAnnotation
		  (prS_ContactItemEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ContactItem is the abstract root class for PRS_Person and PRS_Organization. It provides a common anchor point for the PRS_ContactContactItem association."
		   });
		addAnnotation
		  (prS_ContactItemAddressEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ContactItem with PRS_Address."
		   });
		addAnnotation
		  (prS_ExpressionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Expression defines a specific relationship between PRS_ExpressionElements associated with PRS_SolutionElements."
		   });
		addAnnotation
		  (getPRS_Expression_Relation(),
		   source,
		   new String[] {
			   "documentation", "The operator to be used with the associated PRS_Expression Elements. The \'AND\', \'OR\' and \'NOT\' operators are the only operators currently defined by the standard. (They must be used as uppercase strings.) Note that this is a vendor-extensible property - so that additional operators can be defined and used in implementations."
		   });
		addAnnotation
		  (prS_ExpressionLinkEClass,
		   source,
		   new String[] {
			   "documentation", "Associates a PRS_Expression with PRS_ExpressionElements such as PRS_Expression, PRS_Product, and PRS_Statement."
		   });
		addAnnotation
		  (prS_FeatureResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Feature with PRS_Resource. This is used to track labor and costs associated with specific tasks defined in a Feature object."
		   });
		addAnnotation
		  (prS_OrganizationEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Organization describes a PRS_Contact\'s organization name and business."
		   });
		addAnnotation
		  (getPRS_Organization_Name(),
		   source,
		   new String[] {
			   "documentation", "The name of the organization."
		   });
		addAnnotation
		  (getPRS_Organization_Business(),
		   source,
		   new String[] {
			   "documentation", "Description of organization\'s primary business."
		   });
		addAnnotation
		  (prS_PersonEClass,
		   source,
		   new String[] {
			   "documentation", "Information about a personal contact."
		   });
		addAnnotation
		  (getPRS_Person_FirstName(),
		   source,
		   new String[] {
			   "documentation", "Contact\'s first name."
		   });
		addAnnotation
		  (getPRS_Person_LastName(),
		   source,
		   new String[] {
			   "documentation", "Contact\'s last name."
		   });
		addAnnotation
		  (getPRS_Person_Salutation(),
		   source,
		   new String[] {
			   "documentation", "How the contact is addressed, i.e. Dr., Mr., Ms., Mrs., etc."
		   });
		addAnnotation
		  (getPRS_Person_Title(),
		   source,
		   new String[] {
			   "documentation", "Contact\'s business title."
		   });
		addAnnotation
		  (getPRS_Person_ContactType(),
		   source,
		   new String[] {
			   "documentation", "Description of the contact. For example, they may have responsibilities not apparent from their title."
		   });
		addAnnotation
		  (getPRS_Person_CommunicationMode(),
		   source,
		   new String[] {
			   "documentation", "Contact\'s preferred communication method. See the PRS_Location.LocationType property."
		   });
		addAnnotation
		  (prS_ProblemEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Problem is the root object of a set of associated objects that describe a Problem. One or more Problems may be associated with a Solution. \n\nThe Problem is described by PRS_Statement and PRS_Product instances indirectly associated to the PRS_Problem through a PRS_Expression."
		   });
		addAnnotation
		  (getPRS_Problem_Likelihood(),
		   source,
		   new String[] {
			   "documentation", "The Likelihood describes the potential for the Problem to occur. The value of this property shall be an integer value in the range of 0 to 100, inclusive."
		   });
		addAnnotation
		  (getPRS_Problem_Impact(),
		   source,
		   new String[] {
			   "documentation", "The Impact describes the severity of the problem. The value of this property shall be an integer value in the range of 0 to 100, inclusive."
		   });
		addAnnotation
		  (prS_ProductAssetEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ProductAsset is used to provide specific information about a PRS_Product. PRS_ProductAsset associates this information to a PRS_Product using one or more Statements associated to a PRS_Expression."
		   });
		addAnnotation
		  (prS_ProductComponentEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ProductComponent is used to describe \'has a\' relationships between Products and their components parts. See PRS_ProductParentChild for \'is a\' relationships."
		   });
		addAnnotation
		  (prS_ProductParentChildEClass,
		   source,
		   new String[] {
			   "documentation", "Products may exist in a hierarchy of relationships with related Products. If a Producer deems these hierarchy relationships are relevant to the current Problem or Resolution, then the position of the Product in a hierarchy can be implied using one of two types of relationships: \'is a\' and \'has a\'. An \'is a\' relationship implies a classification, such as versioning or typing. A \'has a\' relationship implies that one product contains another. The PRS_ProductParentChild association is used to imply an \'is a\' hierarchy. Use the ProductComponent association to imply \'has a\' relationships."
		   });
		addAnnotation
		  (prS_ReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Reference is a placeholder to support links between PRS_Expression objects and a PRS_Solution. It does not have any properties. A \'Reference\' Solution uses PRS_Statement objects to describe general, non-diagnostic knowledge and may not include any PRS_Problem and PRS_Resolution instances."
		   });
		addAnnotation
		  (prS_ResolutionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Resolution is the root object of a set of associated objects that describe a the resolution to a Problem. One or more Resolutions may be associated with a Solution. \n\nThe Resolution is described by PRS_Statement and PRS_Product instances indirectly associated to the PRS_Resolution through a PRS_Expression."
		   });
		addAnnotation
		  (getPRS_Resolution_Confidence(),
		   source,
		   new String[] {
			   "documentation", "The Confidence describes the potential for the Resolution to correct the Problem or Problems associated with the PRS_Solution. The value of this property shall be an integer value in the range of 0 to 100, inclusive."
		   });
		addAnnotation
		  (prS_ResolutionResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Resolution with PRS_Resource."
		   });
		addAnnotation
		  (prS_RevisionContactEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Revision and PRS_Contact."
		   });
		addAnnotation
		  (prS_ServiceActivityEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ServiceIncident to PRS_Activity."
		   });
		addAnnotation
		  (prS_ServiceAgreementEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ServiceIncident to PRS_Agreement."
		   });
		addAnnotation
		  (prS_ServiceProblemEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ServiceIncident to PRS_Problem to describe the Problem being submitted to the Service Provider."
		   });
		addAnnotation
		  (prS_ServiceProviderEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ServiceIncident to PRS_Contact to describe the Service Provider."
		   });
		addAnnotation
		  (prS_ServiceRequesterEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_ServiceRequester associates a PRS_ServiceIncident with a PRS_Contact representing the entity requesting service. Note that the Contact class is used for both Requesters and Providers, the context is determined by which association exists."
		   });
		addAnnotation
		  (prS_ServiceResolutionSolutionEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_ServiceIncident to PRS_Solution to describe the Resolutions proposed by the Service Provider."
		   });
		addAnnotation
		  (prS_SolutionCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionCategory associates PRS_Solution with a PRS_Category for classification purposes."
		   });
		addAnnotation
		  (prS_SolutionExpressionEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_SolutionElements (PRS_Reference, PRS_Problem or PRS_Resolution) with PRS_Expressions."
		   });
		addAnnotation
		  (prS_SolutionHasElementEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionHasElement is an abstract base class for associating PRS_Solution with objects derived from PRS_SolutionElement. This association class allows all PRS_Reference, PRS_Problem and PRS_Resolution objects to be retrieved with a single query."
		   });
		addAnnotation
		  (prS_SolutionProblemEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionProblem aggregates a Problem into a Solution."
		   });
		addAnnotation
		  (prS_SolutionReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionReference aggregates a Reference into a Solution."
		   });
		addAnnotation
		  (prS_SolutionResolutionEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_SolutionResolution aggregates a Resolution into a Solution."
		   });
		addAnnotation
		  (prS_StatementFeatureEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Statement with PRS_Feature."
		   });
		addAnnotation
		  (prS_ActivityContactEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Activity with PRS_Contact."
		   });
		addAnnotation
		  (prS_AdminAssociationEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Administrative data with any object derived from PRS_ExchangeElement."
		   });
		addAnnotation
		  (prS_AdministrativeContactEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Administrative and PRS_Contact."
		   });
		addAnnotation
		  (prS_AttachedEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Attachment with PRS_ExchangeElement."
		   });
		addAnnotation
		  (prS_CategorizationEClass,
		   source,
		   new String[] {
			   "documentation", "PRS_Categorization associates PRS_Reference, PRS_Problem or PRS_Resolution with a PRS_Category for classification purposes. For example, a Category named \'Printing Issues\' can be defined for a Problem using the Categorization association between a PRS_Problem and a PRS_Category."
		   });
		addAnnotation
		  (prS_ContactContactItemEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract root class to associate PRS_Person or PRS_Organization and PRS_Contact."
		   });
		addAnnotation
		  (prS_ContactOrganizationEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Contact and PRS_Organization."
		   });
		addAnnotation
		  (prS_ContactPersonEClass,
		   source,
		   new String[] {
			   "documentation", "Associates PRS_Contact and PRS_Person."
		   });
		addAnnotation
		  (prS_SISServiceEClass,
		   source,
		   new String[] {
			   "documentation", "The PRS_SISService is used as a class factory for PRS_Transactions."
		   });
		addAnnotation
		  (getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction(),
		   source,
		   new String[] {
			   "documentation", "When invoked on a local system, this method validates the objects in the local repository, to determine if they are sufficient for the indicated (input parameter) TransactionType. If not, an error is returned and no additional processing is performed. If the repository is successfully validated, this method creates a PRS_Transaction instance for return to the caller. \n\nThe method also reviews the repository looking for new, modified or deleted objects. As these objects are located, their keys are appended to the related strings in the PRS_Activity instance referenced by another parameter of this method. \n\nAfter all the appropriate new, modified or deleted objects have been located, this method invokes the PRS_SISService\'s StartSISTransaction method on the remote system specified by the objects related to the Service Incident, associated with the PRS_Activity instance specified as a method parameter. The TransactionType and PRS_Activity REF is forwarded to the remote system as method parameters as well as the PRS_Transaction REF for the instance created by this method. \n\nThe remote system creates a child namespace using the PRS_Transaction REF for the name. The local system then transfers all of the new, modified and deleted objects to the namespace on the remote system. Once all objects have been successfully transferred, the PRS_SISService\'s EndSISTransaction method is invoked on the remote system with a Status value of zero to indicate that the remote system should attempt to commit the transaction to the remote repository. \n\nThe remote system passes the results of the remote commit back to the originating system by invoking the PRS_SISService\'s SetSISCompletionStatus method on the system that originated the SIS transaction. The CompletionStatus method parameter indicates whether the remote commit was successful. If the CompletionStatis is zero, the remote commit was successful. If it was unsuccessful, the objects were not applied to the remote repository and the CompletionStatus is non-zero, indicating the error. The local invocation of the SetSIS CompletionStatus method updates the specified PRS_Transaction\'s TransactionState to Closed and CompletionStatus to the value provided by the remote system in the CompletionStatus method parameter. \n\nIn order to promote extensibility, the uint32 return values for PRS_SISService\'s methods and Status-related parameters are mapped into three sections. The first describes the type of value being reported. It indicates Error versus Notification, and Standard versus Vendor-Specific. \n\nThe second section describes the source of the value. It indicates Method, Operating System, Repository, or Transport. In addition, this section indicates whether the value was created locally or remotely. \n\nThe third section is the specific return value. \n\nIf all 32 bits of the return value are reset, the method completed successfully. Any other value indicates an error condition or notification. If D31 is set, the method did not complete successfully. If D31 is reset, but the rest of the return value is non-zero, this is a Notification that the operation did complete successfully, but that there is a conditon of which the caller should be aware. \n\nIf D30 is set, the return value is vendor specific. If D30 is reset, the return value is defined by the standard. \n\nIf D29 is set, the return value was generated by a remote system. If D29 is reset, the return value was generated locally. The bit is always set or reset by the local system. The local system sets the bit if it receives a non-zero return value from a remote method invocation. \n\nBit D28 is reserved for future use and shall be reset on all return values. \n\nWhen there is an error or notification, D24 through D27 indicate its source. The following sources are currently defined (D24 is the least significant bit below): \n0000 Method \n0001 Operating System \n0010 Repository \n0011 Transport \nAll remaining values are reserved. \n\nBits D16 through D23 are reserved for future use and shall be reset to zero. \n\nBits D0 through D15 indicate the specific return value. If zero, all other bits in the return value must be zero, indicating successful completion of the method (or Transaction)."
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "The specific SIS transaction represented by this instance."
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "documentation", "TransactionRef identifies the PRS_Transaction to commit or abort. If this property is NULL or does not identify an \'Open\' transaction, this method returns an error."
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(2),
		   source,
		   new String[] {
			   "documentation", "ActivityRef associates a time and description of the activity involved in the service incident transaction."
		   });
		addAnnotation
		  (getPRS_SISService__EndSISTransaction__Long_PRS_Transaction(),
		   source,
		   new String[] {
			   "documentation", "The EndSISTransaction method is used to handle committing or aborting a transaction. For commit, the method is invoked by a remote system when all of the objects associated with the transaction have been placed in the child namespace created by StartSISTransaction. \n\nFor abort, the method cleans up the child namespace and closes the specified PRS_Transaction, setting the Transaction\'s CompletionStatus to the method parameter of the same name."
		   });
		addAnnotation
		  ((getPRS_SISService__EndSISTransaction__Long_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "Status indicates whether the transaction is to be committed or aborted. If Status is zero, the transaction is to be committed. If Status is non-zero, it indicates the transaction is to be aborted. If the transaction is being aborted, the Status field is passed back to the originating system as the CompletionStatus parameter for the PRS_SISService SetSISCompletionStatus method. See the description for PRS_SISService.StartSISTransaction for the definition of the contents of this property."
		   });
		addAnnotation
		  ((getPRS_SISService__EndSISTransaction__Long_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "documentation", "TransactionRef identifies the PRS_Transaction to commit or abort. If this property is NULL or does not identify an \'Open\' transaction, this method returns an error."
		   });
		addAnnotation
		  (getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction(),
		   source,
		   new String[] {
			   "documentation", "SetSISCompletionStatus is used to signal the system that originated a PRS_Transaction that the remote system has completed processing of the transaction. If the processing was successful, as indicated by the CompletionStatus parameter, the local system resets the DirtyFlag for all of the objects identified in the PRS_Activity instance associated with the PRS_Transaction."
		   });
		addAnnotation
		  ((getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "documentation", "This parameter is used to set the CompletionStatus field of the specified PRS_Transaction. If zero, the Transaction was completed successfully. If non-zero, an error occurred and the objects provided in StartSISTransaction were not submitted to the remote repository. See the description for PRS_SISService.StartSISTransaction for the definition of the contents of this property."
		   });
		addAnnotation
		  ((getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "documentation", "TransactionRef identifies the PRS_Transaction that has completed. If this property is NULL or does not identify an \'Open\' transaction, this method returns an error."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schemas.dmtf.org/wbem/cim</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCimAnnotations() {
		String source = "http://schemas.dmtf.org/wbem/cim";
		addAnnotation
		  (prS_ExchangeElementEClass,
		   source,
		   new String[] {
			   "Abstract", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_ExchangeElement_PRSUniqueName(),
		   source,
		   new String[] {
			   "cimType", "string",
			   "Key", "true"
		   });
		addAnnotation
		  (getPRS_ExchangeElement_DirtyFlag(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\"]",
			   "Values", "[\"Clean\",\"New\",\"Modified\",\"Deleted\"]"
		   });
		addAnnotation
		  (prS_ExpressionElementEClass,
		   source,
		   new String[] {
			   "Abstract", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (prS_FeatureEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Feature_Prompt(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Feature_ValidValues(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Feature_DataType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"254\",\"255\"]",
			   "Values", "[\"String\",\"Integer\",\"Float\",\"Date/Time\",\"Boolean\",\"Binary\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (prS_LocationEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Location_LocationType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"254\",\"255\"]",
			   "Values", "[\"Primary_Voice\",\"Alternate_Voice\",\"Fax\",\"Email\",\"URL\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Location_LocationID(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_ProductEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Product_Vendor(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Product_ProductName(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Product_Version(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Product_Order(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_ResourceEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Resource_ResourceType(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Resource_Quantity(),
		   source,
		   new String[] {
			   "cimType", "uint16"
		   });
		addAnnotation
		  (getPRS_Resource_Units(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_RevisionEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Description", "string",
			   "override.Description.Description", "Text description of what was done in this revision.",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Revision_RevisionDate(),
		   source,
		   new String[] {
			   "cimType", "datetime"
		   });
		addAnnotation
		  (getPRS_Revision_ActivityName(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"254\",\"255\"]",
			   "Values", "[\"Create\",\"Update\",\"Delete\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Revision_ActivityType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"254\",\"255\"]",
			   "Values", "[\"Technical\",\"Editorial\",\"Administrative\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Revision_TechnicalStatus(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]",
			   "Values", "[\"Open\",\"Not Reviewed\",\"Reviewed\",\"Approved\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Revision_EditorialStatus(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]",
			   "Values", "[\"In_Progress\",\"Draft\",\"Reviewed\",\"Published\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (prS_ServiceIncidentEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_RequesterID(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ProviderID(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_CurrentState(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"254\",\"255\"]",
			   "Values", "[\"Beginning_State\",\"Not_Entitled\",\"Entitled\",\"Problem_Submitted\",\"Open_Requester\",\"Open_Provider\",\"Closed_Pending_Confirmation\",\"Closed\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_RequesterSeverity(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"1\",\"2\",\"3\",\"4\",\"5\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ProviderPriority(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"1\",\"2\",\"3\",\"4\",\"5\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_ResponseTime(),
		   source,
		   new String[] {
			   "cimType", "datetime"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_WorkflowStatus(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Comment(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Entitled(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"254\",\"255\"]",
			   "Values", "[\"Yes\",\"No\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_Acknowledge(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"254\",\"255\"]",
			   "Values", "[\"Yes\",\"No\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_TransactionName(),
		   source,
		   new String[] {
			   "cimType", "string",
			   "Deprecated", "[\"PRS_ServiceIncident.LastTransaction\"]"
		   });
		addAnnotation
		  (getPRS_ServiceIncident_LastTransaction(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]",
			   "Values", "[\"Service_Request\",\"Entitlement\",\"Problem_Submittal\",\"Accept_Problem\",\"Problem_Resolution\",\"Request_Problem_Information\",\"Provide_Problem_Information\",\"Provide_Admin_Information\",\"Query_Incident\",\"Confirm_Close\",\"Reject_Resolution\",\"Request_Closure\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (prS_SolutionEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Solution_Title(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Solution_SolutionAbstract(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Solution_SolutionType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"254\",\"255\"]",
			   "Values", "[\"Reference\",\"Diagnostic\",\"How To\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (prS_SolutionElementEClass,
		   source,
		   new String[] {
			   "Abstract", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (prS_StatementEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Statement_StatementRole(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]",
			   "Values", "[\"Description\",\"Symptom\",\"Error_Message\",\"Objective\",\"Evidence\",\"Cause\",\"Work_Around\",\"Fix\",\"Answer\",\"Keyword\",\"Changes\",\"Title\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Statement_Text(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Statement_StatementOperator(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Statement_FeatureValue(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Statement_Order(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Statement_Relevance(),
		   source,
		   new String[] {
			   "cimType", "uint16",
			   "MinValue", "0",
			   "MaxValue", "100"
		   });
		addAnnotation
		  (prS_TransactionEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Transaction_TransactionType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]",
			   "Values", "[\"Service_Request\",\"Entitlement\",\"Problem_Submittal\",\"Accept_Problem\",\"Problem_Resolution\",\"Request_Problem_Information\",\"Provide_Problem_Information\",\"Provide_Admin_Information\",\"Query_Incident\",\"Confirm_Close\",\"Reject_Resolution\",\"Request_Closure\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Transaction_TransactionState(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\"]",
			   "Values", "[\"Open\",\"Working\",\"Closed\",\"Notification_Pending\"]"
		   });
		addAnnotation
		  (getPRS_Transaction_CompletionStatus(),
		   source,
		   new String[] {
			   "cimType", "uint32"
		   });
		addAnnotation
		  (prS_ActivityEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Activity_ParameterList(),
		   source,
		   new String[] {
			   "cimType", "string",
			   "Deprecated", "[\"PRS_Activity.NewKeys\",\"PRS_Activity.Deleted\",\"PRS_Activity.Modified\"]"
		   });
		addAnnotation
		  (getPRS_Activity_NewKeys(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Activity_Deleted(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Activity_Modified(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Activity_LocalDate(),
		   source,
		   new String[] {
			   "cimType", "datetime"
		   });
		addAnnotation
		  (getPRS_Activity_ActionLog(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_ActivityResourceEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Activity REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Max", "1",
			   "override.Antecedent.Description", "The PRS_Activity.",
			   "override.Dependent", "PRS_Resource REF",
			   "override.Dependent.Description", "The PRS_Resource.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ActivityTransactionEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Activity REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Max", "1",
			   "override.Antecedent.Description", "The PRS_Activity.",
			   "override.Dependent", "PRS_Transaction REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Transaction.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AddressEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Address_AddressType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]",
			   "Values", "[\"Primary\",\"Shipping\",\"Billing\",\"Service\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Address_Address1(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_Address2(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_Address3(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_Address4(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_City(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_Region(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_PostalCode(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_TimeZone(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Address_Country(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_AddressLocationEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Address REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Address.",
			   "override.Dependent", "PRS_Location REF",
			   "override.Dependent.Description", "The PRS_Location.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AdministrativeEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Administrative_ComplianceLevel(),
		   source,
		   new String[] {
			   "cimType", "uint16",
			   "ValueMap", "[\"0\",\"1\",\"2\"]"
		   });
		addAnnotation
		  (getPRS_Administrative_DocumentStatus(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"254\",\"255\"]",
			   "Values", "[\"Draft\",\"Reviewed\",\"Published\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Administrative_Distribution(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]",
			   "Values", "[\"Proprietary\",\"Internal\",\"Partner\",\"Public\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (getPRS_Administrative_Language(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Administrative_Copyright(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Administrative_Disclaimer(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Administrative_Rights(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_AdministrativeRevisionEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.8.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Administrative REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Max", "1",
			   "override.Antecedent.Description", "The PRS_Administrative.",
			   "override.Dependent", "PRS_Revision REF",
			   "override.Dependent.Description", "The PRS_Revision.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AgreementEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Agreement_ContractID(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Agreement_AgreementType(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_AttachmentEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentReference(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Attachment_Protocol(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Attachment_Format(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentSize(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentObject(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentType(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"254\",\"255\"]",
			   "Values", "[\"Instructions\",\"Background\",\"Log\",\"Unknown\",\"Undefined\"]"
		   });
		addAnnotation
		  (getPRS_Attachment_AttachmentName(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_CategoryEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Category_CategoryContents(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Category_CategoryType(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_CategoryParentChildEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.8.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Category REF",
			   "override.Antecedent.Description", "The parent PRS_Category used for classification.",
			   "override.Dependent", "PRS_Category REF",
			   "override.Dependent.Description", "The child PRS_Category used for classification.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ContactEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (prS_ContactItemEClass,
		   source,
		   new String[] {
			   "Abstract", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (prS_ContactItemAddressEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ContactItem REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_ContactItem.",
			   "override.Dependent", "PRS_Address REF",
			   "override.Dependent.Description", "The PRS_Address.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ExpressionEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Expression_Relation(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_ExpressionLinkEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.8.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Expression REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The parent PRS_Expression.",
			   "override.Dependent", "PRS_ExpressionElement REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The child PRS_ExpressionElement, either a PRS_Expression, PRS_Product or PRS_Statement.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_FeatureResourceEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Feature REF",
			   "override.Antecedent.Description", "The PRS_Feature.",
			   "override.Dependent", "PRS_Resource REF",
			   "override.Dependent.Description", "The PRS_Resource.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_OrganizationEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Organization_Name(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Organization_Business(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (prS_PersonEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Person_FirstName(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Person_LastName(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Person_Salutation(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Person_Title(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Person_ContactType(),
		   source,
		   new String[] {
			   "cimType", "string"
		   });
		addAnnotation
		  (getPRS_Person_CommunicationMode(),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"254\",\"255\"]",
			   "Values", "[\"Primary_Voice\",\"Alternate_Voice\",\"Fax\",\"Email\",\"URL\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  (prS_ProblemEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Problem_Likelihood(),
		   source,
		   new String[] {
			   "cimType", "uint16",
			   "MinValue", "0",
			   "MaxValue", "100"
		   });
		addAnnotation
		  (getPRS_Problem_Impact(),
		   source,
		   new String[] {
			   "cimType", "uint16",
			   "MinValue", "0",
			   "MaxValue", "100"
		   });
		addAnnotation
		  (prS_ProductAssetEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Product REF",
			   "override.Antecedent.Description", "The product.",
			   "override.Dependent", "PRS_Expression REF",
			   "override.Dependent.Description", "The expression.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ProductComponentEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Product REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Description", "The PRS_Product which contains the component.",
			   "override.Dependent", "PRS_Product REF",
			   "override.Dependent.Description", "The component PRS_Product.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ProductParentChildEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Product REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Description", "The parent PRS_Product.",
			   "override.Dependent", "PRS_Product REF",
			   "override.Dependent.Description", "The child PRS_Product.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ReferenceEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (prS_ResolutionEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "PRSUniqueName"
		   });
		addAnnotation
		  (getPRS_Resolution_Confidence(),
		   source,
		   new String[] {
			   "cimType", "uint16",
			   "MinValue", "0",
			   "MaxValue", "100"
		   });
		addAnnotation
		  (prS_ResolutionResourceEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Resource REF",
			   "override.Antecedent.Description", "The PRS_Resource.",
			   "override.Dependent", "PRS_Resolution REF",
			   "override.Dependent.Description", "The PRS_Resolution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_RevisionContactEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Revision REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Description", "The PRS_Revision.",
			   "override.Dependent", "PRS_Contact REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_Contact.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceActivityEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Max", "1",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Activity REF",
			   "override.Dependent.Description", "The PRS_Activity.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceAgreementEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Agreement REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Agreement.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceProblemEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Problem REF",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Problem.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceProviderEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Contact REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Contact.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceRequesterEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Contact REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Contact.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ServiceResolutionSolutionEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ServiceIncident REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Description", "The PRS_ServiceIncident.",
			   "override.Dependent", "PRS_Solution REF",
			   "override.Dependent.Description", "The PRS_Solution. PRS_Solution must be associated with at least one Resolution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionCategoryEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Solution REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Solution being classified.",
			   "override.Dependent", "PRS_Category REF",
			   "override.Dependent.Description", "The specific PRS_Category being used to classify the Solution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionExpressionEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_SolutionElement REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_SolutionElement.",
			   "override.Dependent", "PRS_Expression REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_Expression.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionHasElementEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Abstract", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Solution REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Solution root object of the Solution.",
			   "override.Dependent", "PRS_SolutionElement REF",
			   "override.Dependent.Description", "The PRS_Reference, PRS_Problem or PRS_Resolution aggregated into the Solution by this association.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionProblemEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Solution REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Solution root object of the Solution.",
			   "override.Dependent", "PRS_Problem REF",
			   "override.Dependent.Description", "The PRS_Problem aggregated into the Solution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionReferenceEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Solution REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Solution root object of the Solution.",
			   "override.Dependent", "PRS_Reference REF",
			   "override.Dependent.Description", "The PRS_Reference aggregated into the Solution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SolutionResolutionEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Solution REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Solution root object of the Solution.",
			   "override.Dependent", "PRS_Resolution REF",
			   "override.Dependent.Description", "The PRS_Solution aggregated into the Solution.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_StatementFeatureEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Statement REF",
			   "override.Antecedent.Description", "The PRS_Statement.",
			   "override.Dependent", "PRS_Feature REF",
			   "override.Dependent.Description", "The PRS_Feature.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ActivityContactEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Activity REF",
			   "override.Antecedent.Description", "The PRS_Activity.",
			   "override.Dependent", "PRS_Contact REF",
			   "override.Dependent.Max", "1",
			   "override.Dependent.Description", "The PRS_Contact.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AdminAssociationEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_ExchangeElement REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_ExchangeElement.",
			   "override.Dependent", "PRS_Administrative REF",
			   "override.Dependent.Description", "The PRS_Administrative object.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AdministrativeContactEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Aggregation", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Administrative REF",
			   "override.Antecedent.Aggregate", "true",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Administrative instance.",
			   "override.Dependent", "PRS_Contact REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_Contact.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_AttachedEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Attachment REF",
			   "override.Antecedent.Description", "The PRS_Attachment.",
			   "override.Dependent", "PRS_ExchangeElement REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_ExchangeElement.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_CategorizationEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Category REF",
			   "override.Antecedent.Description", "The PRS_Category used for classification.",
			   "override.Dependent", "PRS_SolutionElement REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The specific PRS_Reference, PRS_Problem or PRS_Resolution classified by this association.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ContactContactItemEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Abstract", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Contact REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Contact.",
			   "override.Dependent", "PRS_ContactItem REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_ContactItem, either PRS_Person or PRS_Organization. There is always at least one PRS_ContactItem, however it may be either a PRS_Person or PRS_Organization. For that reason, there is a minimum cardinality of one for this property, but a minimum cardinality of zero in the classes derived from this class.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ContactOrganizationEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Contact REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Contact.",
			   "override.Dependent", "PRS_Organization REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_Organization.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_ContactPersonEClass,
		   source,
		   new String[] {
			   "Association", "true",
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "override.Antecedent", "PRS_Contact REF",
			   "override.Antecedent.Min", "1",
			   "override.Antecedent.Description", "The PRS_Contact.",
			   "override.Dependent", "PRS_Person REF",
			   "override.Dependent.Min", "1",
			   "override.Dependent.Description", "The PRS_Person.",
			   "keys", "Antecedent,Dependent"
		   });
		addAnnotation
		  (prS_SISServiceEClass,
		   source,
		   new String[] {
			   "Version", "2.6.0",
			   "UMLPackagePath", "PRS::Support",
			   "keys", "SystemCreationClassName,SystemName,CreationClassName,Name"
		   });
		addAnnotation
		  (getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction(),
		   source,
		   new String[] {
			   "cimType", "uint32"
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "cimType", "uint8",
			   "In", "true",
			   "ValueMap", "[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]",
			   "Values", "[\"Service_Request\",\"Entitlement\",\"Problem_Submittal\",\"Accept_Problem\",\"Problem_Resolution\",\"Request_Problem_Information\",\"Provide_Problem_Information\",\"Provide_Admin_Information\",\"Query_Incident\",\"Confirm_Close\",\"Reject_Resolution\",\"Request_Closure\",\"Other\",\"Unknown\"]"
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "cimType", "PRS_Activity REF",
			   "In", "true"
		   });
		addAnnotation
		  ((getPRS_SISService__StartSISTransaction__Integer_PRS_Activity_PRS_Transaction()).getEParameters().get(2),
		   source,
		   new String[] {
			   "cimType", "PRS_Transaction REF",
			   "In", "true",
			   "Out", "true"
		   });
		addAnnotation
		  (getPRS_SISService__EndSISTransaction__Long_PRS_Transaction(),
		   source,
		   new String[] {
			   "cimType", "uint32"
		   });
		addAnnotation
		  ((getPRS_SISService__EndSISTransaction__Long_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "cimType", "uint32",
			   "In", "true"
		   });
		addAnnotation
		  ((getPRS_SISService__EndSISTransaction__Long_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "cimType", "PRS_Transaction REF",
			   "In", "true"
		   });
		addAnnotation
		  (getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction(),
		   source,
		   new String[] {
			   "cimType", "uint32"
		   });
		addAnnotation
		  ((getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction()).getEParameters().get(0),
		   source,
		   new String[] {
			   "cimType", "uint32",
			   "In", "true"
		   });
		addAnnotation
		  ((getPRS_SISService__SetSISCompletionStatus__Long_PRS_Transaction()).getEParameters().get(1),
		   source,
		   new String[] {
			   "cimType", "PRS_Transaction REF",
			   "In", "true"
		   });
	}

} //PrsPackageImpl
