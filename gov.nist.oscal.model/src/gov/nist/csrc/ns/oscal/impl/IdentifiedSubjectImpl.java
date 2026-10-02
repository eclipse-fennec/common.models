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

import gov.nist.csrc.ns.oscal.AssessmentSubject;
import gov.nist.csrc.ns.oscal.IdentifiedSubject;
import gov.nist.csrc.ns.oscal.OSCALPackage;

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
 * An implementation of the model object '<em><b>Identified Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.IdentifiedSubjectImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.IdentifiedSubjectImpl#getSubjectPlaceholderUuid <em>Subject Placeholder Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifiedSubjectImpl extends MinimalEObjectImpl.Container implements IdentifiedSubject {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<AssessmentSubject> subject;

	/**
	 * The default value of the '{@link #getSubjectPlaceholderUuid() <em>Subject Placeholder Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectPlaceholderUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_PLACEHOLDER_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectPlaceholderUuid() <em>Subject Placeholder Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectPlaceholderUuid()
	 * @generated
	 * @ordered
	 */
	protected String subjectPlaceholderUuid = SUBJECT_PLACEHOLDER_UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getIdentifiedSubject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssessmentSubject> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<AssessmentSubject>(AssessmentSubject.class, this, OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectPlaceholderUuid() {
		return subjectPlaceholderUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectPlaceholderUuid(String newSubjectPlaceholderUuid) {
		String oldSubjectPlaceholderUuid = subjectPlaceholderUuid;
		subjectPlaceholderUuid = newSubjectPlaceholderUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID, oldSubjectPlaceholderUuid, subjectPlaceholderUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT:
				return getSubject();
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID:
				return getSubjectPlaceholderUuid();
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
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends AssessmentSubject>)newValue);
				return;
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID:
				setSubjectPlaceholderUuid((String)newValue);
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
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT:
				getSubject().clear();
				return;
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID:
				setSubjectPlaceholderUuid(SUBJECT_PLACEHOLDER_UUID_EDEFAULT);
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
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case OSCALPackage.IDENTIFIED_SUBJECT__SUBJECT_PLACEHOLDER_UUID:
				return SUBJECT_PLACEHOLDER_UUID_EDEFAULT == null ? subjectPlaceholderUuid != null : !SUBJECT_PLACEHOLDER_UUID_EDEFAULT.equals(subjectPlaceholderUuid);
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
		result.append(" (subjectPlaceholderUuid: ");
		result.append(subjectPlaceholderUuid);
		result.append(')');
		return result.toString();
	}

} //IdentifiedSubjectImpl
