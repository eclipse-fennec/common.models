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
import gov.nist.csrc.ns.oscal.ImportProfile;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.SspControlImplementation;
import gov.nist.csrc.ns.oscal.SystemCharacteristics;
import gov.nist.csrc.ns.oscal.SystemImplementation;
import gov.nist.csrc.ns.oscal.SystemSecurityPlan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Security Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getImportProfile <em>Import Profile</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getSystemCharacteristics <em>System Characteristics</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getSystemImplementation <em>System Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemSecurityPlanImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemSecurityPlanImpl extends MinimalEObjectImpl.Container implements SystemSecurityPlan {
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
	 * The cached value of the '{@link #getImportProfile() <em>Import Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportProfile()
	 * @generated
	 * @ordered
	 */
	protected ImportProfile importProfile;

	/**
	 * The cached value of the '{@link #getSystemCharacteristics() <em>System Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected SystemCharacteristics systemCharacteristics;

	/**
	 * The cached value of the '{@link #getSystemImplementation() <em>System Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemImplementation()
	 * @generated
	 * @ordered
	 */
	protected SystemImplementation systemImplementation;

	/**
	 * The cached value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected SspControlImplementation controlImplementation;

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
	protected SystemSecurityPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSystemSecurityPlan();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA, oldMetadata, newMetadata);
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
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportProfile getImportProfile() {
		return importProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportProfile(ImportProfile newImportProfile, NotificationChain msgs) {
		ImportProfile oldImportProfile = importProfile;
		importProfile = newImportProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE, oldImportProfile, newImportProfile);
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
	public void setImportProfile(ImportProfile newImportProfile) {
		if (newImportProfile != importProfile) {
			NotificationChain msgs = null;
			if (importProfile != null)
				msgs = ((InternalEObject)importProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE, null, msgs);
			if (newImportProfile != null)
				msgs = ((InternalEObject)newImportProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE, null, msgs);
			msgs = basicSetImportProfile(newImportProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE, newImportProfile, newImportProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemCharacteristics getSystemCharacteristics() {
		return systemCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemCharacteristics(SystemCharacteristics newSystemCharacteristics, NotificationChain msgs) {
		SystemCharacteristics oldSystemCharacteristics = systemCharacteristics;
		systemCharacteristics = newSystemCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS, oldSystemCharacteristics, newSystemCharacteristics);
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
	public void setSystemCharacteristics(SystemCharacteristics newSystemCharacteristics) {
		if (newSystemCharacteristics != systemCharacteristics) {
			NotificationChain msgs = null;
			if (systemCharacteristics != null)
				msgs = ((InternalEObject)systemCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS, null, msgs);
			if (newSystemCharacteristics != null)
				msgs = ((InternalEObject)newSystemCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS, null, msgs);
			msgs = basicSetSystemCharacteristics(newSystemCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS, newSystemCharacteristics, newSystemCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemImplementation getSystemImplementation() {
		return systemImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemImplementation(SystemImplementation newSystemImplementation, NotificationChain msgs) {
		SystemImplementation oldSystemImplementation = systemImplementation;
		systemImplementation = newSystemImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION, oldSystemImplementation, newSystemImplementation);
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
	public void setSystemImplementation(SystemImplementation newSystemImplementation) {
		if (newSystemImplementation != systemImplementation) {
			NotificationChain msgs = null;
			if (systemImplementation != null)
				msgs = ((InternalEObject)systemImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION, null, msgs);
			if (newSystemImplementation != null)
				msgs = ((InternalEObject)newSystemImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION, null, msgs);
			msgs = basicSetSystemImplementation(newSystemImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION, newSystemImplementation, newSystemImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SspControlImplementation getControlImplementation() {
		return controlImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlImplementation(SspControlImplementation newControlImplementation, NotificationChain msgs) {
		SspControlImplementation oldControlImplementation = controlImplementation;
		controlImplementation = newControlImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION, oldControlImplementation, newControlImplementation);
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
	public void setControlImplementation(SspControlImplementation newControlImplementation) {
		if (newControlImplementation != controlImplementation) {
			NotificationChain msgs = null;
			if (controlImplementation != null)
				msgs = ((InternalEObject)controlImplementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION, null, msgs);
			if (newControlImplementation != null)
				msgs = ((InternalEObject)newControlImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION, null, msgs);
			msgs = basicSetControlImplementation(newControlImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION, newControlImplementation, newControlImplementation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER, oldBackMatter, newBackMatter);
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
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER, newBackMatter, newBackMatter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_SECURITY_PLAN__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE:
				return basicSetImportProfile(null, msgs);
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS:
				return basicSetSystemCharacteristics(null, msgs);
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION:
				return basicSetSystemImplementation(null, msgs);
			case OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION:
				return basicSetControlImplementation(null, msgs);
			case OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER:
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
			case OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA:
				return getMetadata();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE:
				return getImportProfile();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS:
				return getSystemCharacteristics();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION:
				return getSystemImplementation();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.SYSTEM_SECURITY_PLAN__UUID:
				return getUuid();
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
			case OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE:
				setImportProfile((ImportProfile)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS:
				setSystemCharacteristics((SystemCharacteristics)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION:
				setSystemImplementation((SystemImplementation)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION:
				setControlImplementation((SspControlImplementation)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__UUID:
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
			case OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE:
				setImportProfile((ImportProfile)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS:
				setSystemCharacteristics((SystemCharacteristics)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION:
				setSystemImplementation((SystemImplementation)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION:
				setControlImplementation((SspControlImplementation)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__UUID:
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
			case OSCALPackage.SYSTEM_SECURITY_PLAN__METADATA:
				return metadata != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__IMPORT_PROFILE:
				return importProfile != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_CHARACTERISTICS:
				return systemCharacteristics != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__SYSTEM_IMPLEMENTATION:
				return systemImplementation != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__CONTROL_IMPLEMENTATION:
				return controlImplementation != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.SYSTEM_SECURITY_PLAN__UUID:
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

} //SystemSecurityPlanImpl
