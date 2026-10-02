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

import gov.nist.csrc.ns.oscal.BackMatter;
import gov.nist.csrc.ns.oscal.Finding;
import gov.nist.csrc.ns.oscal.ImportSsp;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Observation;
import gov.nist.csrc.ns.oscal.PlanOfActionAndMilestones;
import gov.nist.csrc.ns.oscal.PoamItem;
import gov.nist.csrc.ns.oscal.PoamLocalDefinitions;
import gov.nist.csrc.ns.oscal.Risk;
import gov.nist.csrc.ns.oscal.SystemId;

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
 * An implementation of the model object '<em><b>Plan Of Action And Milestones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getImportSsp <em>Import Ssp</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getSystemId <em>System Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getFinding <em>Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getPoamItem <em>Poam Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PlanOfActionAndMilestonesImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanOfActionAndMilestonesImpl extends MinimalEObjectImpl.Container implements PlanOfActionAndMilestones {
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
	 * The cached value of the '{@link #getImportSsp() <em>Import Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSsp()
	 * @generated
	 * @ordered
	 */
	protected ImportSsp importSsp;

	/**
	 * The cached value of the '{@link #getSystemId() <em>System Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemId()
	 * @generated
	 * @ordered
	 */
	protected SystemId systemId;

	/**
	 * The cached value of the '{@link #getLocalDefinitions() <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDefinitions()
	 * @generated
	 * @ordered
	 */
	protected PoamLocalDefinitions localDefinitions;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observation;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected EList<Risk> risk;

	/**
	 * The cached value of the '{@link #getFinding() <em>Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Finding> finding;

	/**
	 * The cached value of the '{@link #getPoamItem() <em>Poam Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoamItem()
	 * @generated
	 * @ordered
	 */
	protected EList<PoamItem> poamItem;

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
	protected PlanOfActionAndMilestonesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getPlanOfActionAndMilestones();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA, oldMetadata, newMetadata);
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
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportSsp getImportSsp() {
		return importSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportSsp(ImportSsp newImportSsp, NotificationChain msgs) {
		ImportSsp oldImportSsp = importSsp;
		importSsp = newImportSsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP, oldImportSsp, newImportSsp);
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
	public void setImportSsp(ImportSsp newImportSsp) {
		if (newImportSsp != importSsp) {
			NotificationChain msgs = null;
			if (importSsp != null)
				msgs = ((InternalEObject)importSsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP, null, msgs);
			if (newImportSsp != null)
				msgs = ((InternalEObject)newImportSsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP, null, msgs);
			msgs = basicSetImportSsp(newImportSsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP, newImportSsp, newImportSsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemId getSystemId() {
		return systemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemId(SystemId newSystemId, NotificationChain msgs) {
		SystemId oldSystemId = systemId;
		systemId = newSystemId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID, oldSystemId, newSystemId);
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
	public void setSystemId(SystemId newSystemId) {
		if (newSystemId != systemId) {
			NotificationChain msgs = null;
			if (systemId != null)
				msgs = ((InternalEObject)systemId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID, null, msgs);
			if (newSystemId != null)
				msgs = ((InternalEObject)newSystemId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID, null, msgs);
			msgs = basicSetSystemId(newSystemId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID, newSystemId, newSystemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PoamLocalDefinitions getLocalDefinitions() {
		return localDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDefinitions(PoamLocalDefinitions newLocalDefinitions, NotificationChain msgs) {
		PoamLocalDefinitions oldLocalDefinitions = localDefinitions;
		localDefinitions = newLocalDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS, oldLocalDefinitions, newLocalDefinitions);
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
	public void setLocalDefinitions(PoamLocalDefinitions newLocalDefinitions) {
		if (newLocalDefinitions != localDefinitions) {
			NotificationChain msgs = null;
			if (localDefinitions != null)
				msgs = ((InternalEObject)localDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS, null, msgs);
			if (newLocalDefinitions != null)
				msgs = ((InternalEObject)newLocalDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS, null, msgs);
			msgs = basicSetLocalDefinitions(newLocalDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS, newLocalDefinitions, newLocalDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Observation> getObservation() {
		if (observation == null) {
			observation = new EObjectContainmentEList<Observation>(Observation.class, this, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION);
		}
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Risk> getRisk() {
		if (risk == null) {
			risk = new EObjectContainmentEList<Risk>(Risk.class, this, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK);
		}
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Finding> getFinding() {
		if (finding == null) {
			finding = new EObjectContainmentEList<Finding>(Finding.class, this, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING);
		}
		return finding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PoamItem> getPoamItem() {
		if (poamItem == null) {
			poamItem = new EObjectContainmentEList<PoamItem>(PoamItem.class, this, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM);
		}
		return poamItem;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER, oldBackMatter, newBackMatter);
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
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER, newBackMatter, newBackMatter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP:
				return basicSetImportSsp(null, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID:
				return basicSetSystemId(null, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS:
				return basicSetLocalDefinitions(null, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION:
				return ((InternalEList<?>)getObservation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK:
				return ((InternalEList<?>)getRisk()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING:
				return ((InternalEList<?>)getFinding()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM:
				return ((InternalEList<?>)getPoamItem()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER:
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
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA:
				return getMetadata();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP:
				return getImportSsp();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID:
				return getSystemId();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS:
				return getLocalDefinitions();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION:
				return getObservation();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK:
				return getRisk();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING:
				return getFinding();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM:
				return getPoamItem();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__UUID:
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
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP:
				setImportSsp((ImportSsp)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID:
				setSystemId((SystemId)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS:
				setLocalDefinitions((PoamLocalDefinitions)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION:
				getObservation().clear();
				getObservation().addAll((Collection<? extends Observation>)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK:
				getRisk().clear();
				getRisk().addAll((Collection<? extends Risk>)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING:
				getFinding().clear();
				getFinding().addAll((Collection<? extends Finding>)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM:
				getPoamItem().clear();
				getPoamItem().addAll((Collection<? extends PoamItem>)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__UUID:
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
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP:
				setImportSsp((ImportSsp)null);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID:
				setSystemId((SystemId)null);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS:
				setLocalDefinitions((PoamLocalDefinitions)null);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION:
				getObservation().clear();
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK:
				getRisk().clear();
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING:
				getFinding().clear();
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM:
				getPoamItem().clear();
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__UUID:
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
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__METADATA:
				return metadata != null;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__IMPORT_SSP:
				return importSsp != null;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__SYSTEM_ID:
				return systemId != null;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__LOCAL_DEFINITIONS:
				return localDefinitions != null;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__OBSERVATION:
				return observation != null && !observation.isEmpty();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__RISK:
				return risk != null && !risk.isEmpty();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__FINDING:
				return finding != null && !finding.isEmpty();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__POAM_ITEM:
				return poamItem != null && !poamItem.isEmpty();
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.PLAN_OF_ACTION_AND_MILESTONES__UUID:
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

} //PlanOfActionAndMilestonesImpl
