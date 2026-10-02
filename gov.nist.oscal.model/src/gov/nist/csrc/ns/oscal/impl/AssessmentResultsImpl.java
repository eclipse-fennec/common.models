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

import gov.nist.csrc.ns.oscal.AssessmentResults;
import gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions;
import gov.nist.csrc.ns.oscal.BackMatter;
import gov.nist.csrc.ns.oscal.ImportAp;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Result;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getImportAp <em>Import Ap</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getResult <em>Result</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.AssessmentResultsImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentResultsImpl extends MinimalEObjectImpl.Container implements AssessmentResults {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getImportAp() <em>Import Ap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportAp()
	 * @generated
	 * @ordered
	 */
	protected ImportAp importAp;

	/**
	 * The cached value of the '{@link #getLocalDefinitions() <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDefinitions()
	 * @generated
	 * @ordered
	 */
	protected AssessmentResultsLocalDefinitions localDefinitions;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> result;

	/**
	 * The cached value of the '{@link #getBackMatter() <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackMatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backMatter;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getAssessmentResults();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportAp getImportAp() {
		return importAp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportAp(ImportAp newImportAp, NotificationChain msgs) {
		ImportAp oldImportAp = importAp;
		importAp = newImportAp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP, oldImportAp, newImportAp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportAp(ImportAp newImportAp) {
		if (newImportAp != importAp) {
			NotificationChain msgs = null;
			if (importAp != null)
				msgs = ((InternalEObject)importAp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP, null, msgs);
			if (newImportAp != null)
				msgs = ((InternalEObject)newImportAp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP, null, msgs);
			msgs = basicSetImportAp(newImportAp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP, newImportAp, newImportAp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentResultsLocalDefinitions getLocalDefinitions() {
		return localDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDefinitions(AssessmentResultsLocalDefinitions newLocalDefinitions, NotificationChain msgs) {
		AssessmentResultsLocalDefinitions oldLocalDefinitions = localDefinitions;
		localDefinitions = newLocalDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS, oldLocalDefinitions, newLocalDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalDefinitions(AssessmentResultsLocalDefinitions newLocalDefinitions) {
		if (newLocalDefinitions != localDefinitions) {
			NotificationChain msgs = null;
			if (localDefinitions != null)
				msgs = ((InternalEObject)localDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS, null, msgs);
			if (newLocalDefinitions != null)
				msgs = ((InternalEObject)newLocalDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS, null, msgs);
			msgs = basicSetLocalDefinitions(newLocalDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS, newLocalDefinitions, newLocalDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Result>(Result.class, this, OSCALPackage.ASSESSMENT_RESULTS__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter getBackMatter() {
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackMatter(BackMatter newBackMatter, NotificationChain msgs) {
		BackMatter oldBackMatter = backMatter;
		backMatter = newBackMatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER, oldBackMatter, newBackMatter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackMatter(BackMatter newBackMatter) {
		if (newBackMatter != backMatter) {
			NotificationChain msgs = null;
			if (backMatter != null)
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER, newBackMatter, newBackMatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.ASSESSMENT_RESULTS__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_RESULTS__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP:
				return basicSetImportAp(null, msgs);
			case OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS:
				return basicSetLocalDefinitions(null, msgs);
			case OSCALPackage.ASSESSMENT_RESULTS__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER:
				return basicSetBackMatter(null, msgs);
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
			case OSCALPackage.ASSESSMENT_RESULTS__METADATA:
				return getMetadata();
			case OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP:
				return getImportAp();
			case OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS:
				return getLocalDefinitions();
			case OSCALPackage.ASSESSMENT_RESULTS__RESULT:
				return getResult();
			case OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.ASSESSMENT_RESULTS__UUID:
				return getUuid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.ASSESSMENT_RESULTS__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP:
				setImportAp((ImportAp)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS:
				setLocalDefinitions((AssessmentResultsLocalDefinitions)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Result>)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.ASSESSMENT_RESULTS__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP:
				setImportAp((ImportAp)null);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS:
				setLocalDefinitions((AssessmentResultsLocalDefinitions)null);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__RESULT:
				getResult().clear();
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.ASSESSMENT_RESULTS__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.ASSESSMENT_RESULTS__METADATA:
				return metadata != null;
			case OSCALPackage.ASSESSMENT_RESULTS__IMPORT_AP:
				return importAp != null;
			case OSCALPackage.ASSESSMENT_RESULTS__LOCAL_DEFINITIONS:
				return localDefinitions != null;
			case OSCALPackage.ASSESSMENT_RESULTS__RESULT:
				return result != null && !result.isEmpty();
			case OSCALPackage.ASSESSMENT_RESULTS__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.ASSESSMENT_RESULTS__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //AssessmentResultsImpl
