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

import gov.nist.csrc.ns.oscal.Combine;
import gov.nist.csrc.ns.oscal.Custom;
import gov.nist.csrc.ns.oscal.Flat;
import gov.nist.csrc.ns.oscal.Merge;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MergeImpl#getCombine <em>Combine</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MergeImpl#getFlat <em>Flat</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MergeImpl#isAsIs <em>As Is</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MergeImpl#getCustom <em>Custom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeImpl extends MinimalEObjectImpl.Container implements Merge {
	/**
	 * The cached value of the '{@link #getCombine() <em>Combine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombine()
	 * @generated
	 * @ordered
	 */
	protected Combine combine;

	/**
	 * The cached value of the '{@link #getFlat() <em>Flat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlat()
	 * @generated
	 * @ordered
	 */
	protected Flat flat;

	/**
	 * The default value of the '{@link #isAsIs() <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsIs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AS_IS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsIs() <em>As Is</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsIs()
	 * @generated
	 * @ordered
	 */
	protected boolean asIs = AS_IS_EDEFAULT;

	/**
	 * This is true if the As Is attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean asIsESet;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected Custom custom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMerge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combine getCombine() {
		return combine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombine(Combine newCombine, NotificationChain msgs) {
		Combine oldCombine = combine;
		combine = newCombine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__COMBINE, oldCombine, newCombine);
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
	public void setCombine(Combine newCombine) {
		if (newCombine != combine) {
			NotificationChain msgs = null;
			if (combine != null)
				msgs = ((InternalEObject)combine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__COMBINE, null, msgs);
			if (newCombine != null)
				msgs = ((InternalEObject)newCombine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__COMBINE, null, msgs);
			msgs = basicSetCombine(newCombine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__COMBINE, newCombine, newCombine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flat getFlat() {
		return flat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlat(Flat newFlat, NotificationChain msgs) {
		Flat oldFlat = flat;
		flat = newFlat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__FLAT, oldFlat, newFlat);
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
	public void setFlat(Flat newFlat) {
		if (newFlat != flat) {
			NotificationChain msgs = null;
			if (flat != null)
				msgs = ((InternalEObject)flat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__FLAT, null, msgs);
			if (newFlat != null)
				msgs = ((InternalEObject)newFlat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__FLAT, null, msgs);
			msgs = basicSetFlat(newFlat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__FLAT, newFlat, newFlat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAsIs() {
		return asIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsIs(boolean newAsIs) {
		boolean oldAsIs = asIs;
		asIs = newAsIs;
		boolean oldAsIsESet = asIsESet;
		asIsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__AS_IS, oldAsIs, asIs, !oldAsIsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAsIs() {
		boolean oldAsIs = asIs;
		boolean oldAsIsESet = asIsESet;
		asIs = AS_IS_EDEFAULT;
		asIsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OSCALPackage.MERGE__AS_IS, oldAsIs, AS_IS_EDEFAULT, oldAsIsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAsIs() {
		return asIsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Custom getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustom(Custom newCustom, NotificationChain msgs) {
		Custom oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__CUSTOM, oldCustom, newCustom);
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
	public void setCustom(Custom newCustom) {
		if (newCustom != custom) {
			NotificationChain msgs = null;
			if (custom != null)
				msgs = ((InternalEObject)custom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__CUSTOM, null, msgs);
			if (newCustom != null)
				msgs = ((InternalEObject)newCustom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.MERGE__CUSTOM, null, msgs);
			msgs = basicSetCustom(newCustom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.MERGE__CUSTOM, newCustom, newCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MERGE__COMBINE:
				return basicSetCombine(null, msgs);
			case OSCALPackage.MERGE__FLAT:
				return basicSetFlat(null, msgs);
			case OSCALPackage.MERGE__CUSTOM:
				return basicSetCustom(null, msgs);
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
			case OSCALPackage.MERGE__COMBINE:
				return getCombine();
			case OSCALPackage.MERGE__FLAT:
				return getFlat();
			case OSCALPackage.MERGE__AS_IS:
				return isAsIs();
			case OSCALPackage.MERGE__CUSTOM:
				return getCustom();
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
			case OSCALPackage.MERGE__COMBINE:
				setCombine((Combine)newValue);
				return;
			case OSCALPackage.MERGE__FLAT:
				setFlat((Flat)newValue);
				return;
			case OSCALPackage.MERGE__AS_IS:
				setAsIs((Boolean)newValue);
				return;
			case OSCALPackage.MERGE__CUSTOM:
				setCustom((Custom)newValue);
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
			case OSCALPackage.MERGE__COMBINE:
				setCombine((Combine)null);
				return;
			case OSCALPackage.MERGE__FLAT:
				setFlat((Flat)null);
				return;
			case OSCALPackage.MERGE__AS_IS:
				unsetAsIs();
				return;
			case OSCALPackage.MERGE__CUSTOM:
				setCustom((Custom)null);
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
			case OSCALPackage.MERGE__COMBINE:
				return combine != null;
			case OSCALPackage.MERGE__FLAT:
				return flat != null;
			case OSCALPackage.MERGE__AS_IS:
				return isSetAsIs();
			case OSCALPackage.MERGE__CUSTOM:
				return custom != null;
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
		result.append(" (asIs: ");
		if (asIsESet) result.append(asIs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MergeImpl
