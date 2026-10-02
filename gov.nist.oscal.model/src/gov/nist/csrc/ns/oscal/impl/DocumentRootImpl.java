/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AssessmentPlan;
import gov.nist.csrc.ns.oscal.AssessmentResults;
import gov.nist.csrc.ns.oscal.Catalog;
import gov.nist.csrc.ns.oscal.ComponentDefinition;
import gov.nist.csrc.ns.oscal.DocumentRoot;
import gov.nist.csrc.ns.oscal.MappingCollection;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones;
import gov.nist.csrc.ns.oscal.Profile;
import gov.nist.csrc.ns.oscal.SystemSecurityPlan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getAssessmentPlan <em>Assessment Plan</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getAssessmentResults <em>Assessment Results</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getMappingCollection <em>Mapping Collection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getPlanOfActionAndMilestones <em>Plan Of Action And Milestones</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getSystemSecurityPlan <em>System Security Plan</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OSCALPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentPlan getAssessmentPlan() {
		return (AssessmentPlan)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentPlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentPlan(AssessmentPlan newAssessmentPlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentPlan(), newAssessmentPlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessmentPlan(AssessmentPlan newAssessmentPlan) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentPlan(), newAssessmentPlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentResults getAssessmentResults() {
		return (AssessmentResults)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentResults(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentResults(AssessmentResults newAssessmentResults, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentResults(), newAssessmentResults, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessmentResults(AssessmentResults newAssessmentResults) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_AssessmentResults(), newAssessmentResults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog getCatalog() {
		return (Catalog)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_Catalog(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_Catalog(), newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalog(Catalog newCatalog) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_Catalog(), newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition getComponentDefinition() {
		return (ComponentDefinition)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_ComponentDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentDefinition(ComponentDefinition newComponentDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_ComponentDefinition(), newComponentDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentDefinition(ComponentDefinition newComponentDefinition) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_ComponentDefinition(), newComponentDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingCollection getMappingCollection() {
		return (MappingCollection)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_MappingCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingCollection(MappingCollection newMappingCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_MappingCollection(), newMappingCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingCollection(MappingCollection newMappingCollection) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_MappingCollection(), newMappingCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfActionAndMilestones getPlanOfActionAndMilestones() {
		return (PlanOfActionAndMilestones)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_PlanOfActionAndMilestones(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanOfActionAndMilestones(PlanOfActionAndMilestones newPlanOfActionAndMilestones, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_PlanOfActionAndMilestones(), newPlanOfActionAndMilestones, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanOfActionAndMilestones(PlanOfActionAndMilestones newPlanOfActionAndMilestones) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_PlanOfActionAndMilestones(), newPlanOfActionAndMilestones);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profile getProfile() {
		return (Profile)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_Profile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_Profile(), newProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfile(Profile newProfile) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_Profile(), newProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemSecurityPlan getSystemSecurityPlan() {
		return (SystemSecurityPlan)getMixed().get(OSCALPackage.eINSTANCE.getDocumentRoot_SystemSecurityPlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemSecurityPlan(SystemSecurityPlan newSystemSecurityPlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OSCALPackage.eINSTANCE.getDocumentRoot_SystemSecurityPlan(), newSystemSecurityPlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemSecurityPlan(SystemSecurityPlan newSystemSecurityPlan) {
		((FeatureMap.Internal)getMixed()).set(OSCALPackage.eINSTANCE.getDocumentRoot_SystemSecurityPlan(), newSystemSecurityPlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.DOCUMENT_ROOT__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_PLAN:
				return basicSetAssessmentPlan(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_RESULTS:
				return basicSetAssessmentResults(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__CATALOG:
				return basicSetCatalog(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__COMPONENT_DEFINITION:
				return basicSetComponentDefinition(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__MAPPING_COLLECTION:
				return basicSetMappingCollection(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES:
				return basicSetPlanOfActionAndMilestones(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__PROFILE:
				return basicSetProfile(null, msgs);
			case OSCALPackage.DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN:
				return basicSetSystemSecurityPlan(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_PLAN:
				return getAssessmentPlan();
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_RESULTS:
				return getAssessmentResults();
			case OSCALPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog();
			case OSCALPackage.DOCUMENT_ROOT__COMPONENT_DEFINITION:
				return getComponentDefinition();
			case OSCALPackage.DOCUMENT_ROOT__MAPPING_COLLECTION:
				return getMappingCollection();
			case OSCALPackage.DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES:
				return getPlanOfActionAndMilestones();
			case OSCALPackage.DOCUMENT_ROOT__PROFILE:
				return getProfile();
			case OSCALPackage.DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN:
				return getSystemSecurityPlan();
			case OSCALPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_PLAN:
				setAssessmentPlan((AssessmentPlan)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_RESULTS:
				setAssessmentResults((AssessmentResults)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__MAPPING_COLLECTION:
				setMappingCollection((MappingCollection)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES:
				setPlanOfActionAndMilestones((PlanOfActionAndMilestones)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__PROFILE:
				setProfile((Profile)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN:
				setSystemSecurityPlan((SystemSecurityPlan)newValue);
				return;
			case OSCALPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_PLAN:
				setAssessmentPlan((AssessmentPlan)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_RESULTS:
				setAssessmentResults((AssessmentResults)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__MAPPING_COLLECTION:
				setMappingCollection((MappingCollection)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES:
				setPlanOfActionAndMilestones((PlanOfActionAndMilestones)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__PROFILE:
				setProfile((Profile)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN:
				setSystemSecurityPlan((SystemSecurityPlan)null);
				return;
			case OSCALPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OSCALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OSCALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_PLAN:
				return getAssessmentPlan() != null;
			case OSCALPackage.DOCUMENT_ROOT__ASSESSMENT_RESULTS:
				return getAssessmentResults() != null;
			case OSCALPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog() != null;
			case OSCALPackage.DOCUMENT_ROOT__COMPONENT_DEFINITION:
				return getComponentDefinition() != null;
			case OSCALPackage.DOCUMENT_ROOT__MAPPING_COLLECTION:
				return getMappingCollection() != null;
			case OSCALPackage.DOCUMENT_ROOT__PLAN_OF_ACTION_AND_MILESTONES:
				return getPlanOfActionAndMilestones() != null;
			case OSCALPackage.DOCUMENT_ROOT__PROFILE:
				return getProfile() != null;
			case OSCALPackage.DOCUMENT_ROOT__SYSTEM_SECURITY_PLAN:
				return getSystemSecurityPlan() != null;
			case OSCALPackage.DOCUMENT_ROOT__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
