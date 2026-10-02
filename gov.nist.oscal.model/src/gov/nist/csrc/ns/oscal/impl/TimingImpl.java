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

import gov.nist.csrc.ns.oscal.AtFrequency;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.OnDate;
import gov.nist.csrc.ns.oscal.Timing;
import gov.nist.csrc.ns.oscal.WithinDateRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.TimingImpl#getOnDate <em>On Date</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.TimingImpl#getWithinDateRange <em>Within Date Range</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.TimingImpl#getAtFrequency <em>At Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimingImpl extends MinimalEObjectImpl.Container implements Timing {
	/**
	 * The cached value of the '{@link #getOnDate() <em>On Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDate()
	 * @generated
	 * @ordered
	 */
	protected OnDate onDate;

	/**
	 * The cached value of the '{@link #getWithinDateRange() <em>Within Date Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinDateRange()
	 * @generated
	 * @ordered
	 */
	protected WithinDateRange withinDateRange;

	/**
	 * The cached value of the '{@link #getAtFrequency() <em>At Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtFrequency()
	 * @generated
	 * @ordered
	 */
	protected AtFrequency atFrequency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getTiming();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnDate getOnDate() {
		return onDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnDate(OnDate newOnDate, NotificationChain msgs) {
		OnDate oldOnDate = onDate;
		onDate = newOnDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__ON_DATE, oldOnDate, newOnDate);
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
	public void setOnDate(OnDate newOnDate) {
		if (newOnDate != onDate) {
			NotificationChain msgs = null;
			if (onDate != null)
				msgs = ((InternalEObject)onDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__ON_DATE, null, msgs);
			if (newOnDate != null)
				msgs = ((InternalEObject)newOnDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__ON_DATE, null, msgs);
			msgs = basicSetOnDate(newOnDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__ON_DATE, newOnDate, newOnDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WithinDateRange getWithinDateRange() {
		return withinDateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithinDateRange(WithinDateRange newWithinDateRange, NotificationChain msgs) {
		WithinDateRange oldWithinDateRange = withinDateRange;
		withinDateRange = newWithinDateRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__WITHIN_DATE_RANGE, oldWithinDateRange, newWithinDateRange);
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
	public void setWithinDateRange(WithinDateRange newWithinDateRange) {
		if (newWithinDateRange != withinDateRange) {
			NotificationChain msgs = null;
			if (withinDateRange != null)
				msgs = ((InternalEObject)withinDateRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__WITHIN_DATE_RANGE, null, msgs);
			if (newWithinDateRange != null)
				msgs = ((InternalEObject)newWithinDateRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__WITHIN_DATE_RANGE, null, msgs);
			msgs = basicSetWithinDateRange(newWithinDateRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__WITHIN_DATE_RANGE, newWithinDateRange, newWithinDateRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtFrequency getAtFrequency() {
		return atFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtFrequency(AtFrequency newAtFrequency, NotificationChain msgs) {
		AtFrequency oldAtFrequency = atFrequency;
		atFrequency = newAtFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__AT_FREQUENCY, oldAtFrequency, newAtFrequency);
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
	public void setAtFrequency(AtFrequency newAtFrequency) {
		if (newAtFrequency != atFrequency) {
			NotificationChain msgs = null;
			if (atFrequency != null)
				msgs = ((InternalEObject)atFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__AT_FREQUENCY, null, msgs);
			if (newAtFrequency != null)
				msgs = ((InternalEObject)newAtFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.TIMING__AT_FREQUENCY, null, msgs);
			msgs = basicSetAtFrequency(newAtFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.TIMING__AT_FREQUENCY, newAtFrequency, newAtFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.TIMING__ON_DATE:
				return basicSetOnDate(null, msgs);
			case OSCALPackage.TIMING__WITHIN_DATE_RANGE:
				return basicSetWithinDateRange(null, msgs);
			case OSCALPackage.TIMING__AT_FREQUENCY:
				return basicSetAtFrequency(null, msgs);
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
			case OSCALPackage.TIMING__ON_DATE:
				return getOnDate();
			case OSCALPackage.TIMING__WITHIN_DATE_RANGE:
				return getWithinDateRange();
			case OSCALPackage.TIMING__AT_FREQUENCY:
				return getAtFrequency();
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
			case OSCALPackage.TIMING__ON_DATE:
				setOnDate((OnDate)newValue);
				return;
			case OSCALPackage.TIMING__WITHIN_DATE_RANGE:
				setWithinDateRange((WithinDateRange)newValue);
				return;
			case OSCALPackage.TIMING__AT_FREQUENCY:
				setAtFrequency((AtFrequency)newValue);
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
			case OSCALPackage.TIMING__ON_DATE:
				setOnDate((OnDate)null);
				return;
			case OSCALPackage.TIMING__WITHIN_DATE_RANGE:
				setWithinDateRange((WithinDateRange)null);
				return;
			case OSCALPackage.TIMING__AT_FREQUENCY:
				setAtFrequency((AtFrequency)null);
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
			case OSCALPackage.TIMING__ON_DATE:
				return onDate != null;
			case OSCALPackage.TIMING__WITHIN_DATE_RANGE:
				return withinDateRange != null;
			case OSCALPackage.TIMING__AT_FREQUENCY:
				return atFrequency != null;
		}
		return super.eIsSet(featureID);
	}

} //TimingImpl
