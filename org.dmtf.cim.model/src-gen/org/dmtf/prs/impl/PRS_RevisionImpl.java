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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Revision;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_RevisionImpl#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_RevisionImpl#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_RevisionImpl#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_RevisionImpl#getTechnicalStatus <em>Technical Status</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_RevisionImpl#getEditorialStatus <em>Editorial Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_RevisionImpl extends PRS_ExchangeElementImpl implements PRS_Revision {
	/**
	 * The default value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected String revisionDate = REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityName() <em>Activity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected Integer activityName = ACTIVITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTIVITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected Integer activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnicalStatus() <em>Technical Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TECHNICAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalStatus() <em>Technical Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer technicalStatus = TECHNICAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditorialStatus() <em>Editorial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorialStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EDITORIAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorialStatus() <em>Editorial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorialStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer editorialStatus = EDITORIAL_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionDate() {
		return revisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionDate(String newRevisionDate) {
		String oldRevisionDate = revisionDate;
		revisionDate = newRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_REVISION__REVISION_DATE, oldRevisionDate, revisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActivityName() {
		return activityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityName(Integer newActivityName) {
		Integer oldActivityName = activityName;
		activityName = newActivityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_REVISION__ACTIVITY_NAME, oldActivityName, activityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivityType(Integer newActivityType) {
		Integer oldActivityType = activityType;
		activityType = newActivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_REVISION__ACTIVITY_TYPE, oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTechnicalStatus() {
		return technicalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnicalStatus(Integer newTechnicalStatus) {
		Integer oldTechnicalStatus = technicalStatus;
		technicalStatus = newTechnicalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_REVISION__TECHNICAL_STATUS, oldTechnicalStatus, technicalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEditorialStatus() {
		return editorialStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditorialStatus(Integer newEditorialStatus) {
		Integer oldEditorialStatus = editorialStatus;
		editorialStatus = newEditorialStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_REVISION__EDITORIAL_STATUS, oldEditorialStatus, editorialStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_REVISION__REVISION_DATE:
				return getRevisionDate();
			case PrsPackage.PRS_REVISION__ACTIVITY_NAME:
				return getActivityName();
			case PrsPackage.PRS_REVISION__ACTIVITY_TYPE:
				return getActivityType();
			case PrsPackage.PRS_REVISION__TECHNICAL_STATUS:
				return getTechnicalStatus();
			case PrsPackage.PRS_REVISION__EDITORIAL_STATUS:
				return getEditorialStatus();
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
			case PrsPackage.PRS_REVISION__REVISION_DATE:
				setRevisionDate((String)newValue);
				return;
			case PrsPackage.PRS_REVISION__ACTIVITY_NAME:
				setActivityName((Integer)newValue);
				return;
			case PrsPackage.PRS_REVISION__ACTIVITY_TYPE:
				setActivityType((Integer)newValue);
				return;
			case PrsPackage.PRS_REVISION__TECHNICAL_STATUS:
				setTechnicalStatus((Integer)newValue);
				return;
			case PrsPackage.PRS_REVISION__EDITORIAL_STATUS:
				setEditorialStatus((Integer)newValue);
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
			case PrsPackage.PRS_REVISION__REVISION_DATE:
				setRevisionDate(REVISION_DATE_EDEFAULT);
				return;
			case PrsPackage.PRS_REVISION__ACTIVITY_NAME:
				setActivityName(ACTIVITY_NAME_EDEFAULT);
				return;
			case PrsPackage.PRS_REVISION__ACTIVITY_TYPE:
				setActivityType(ACTIVITY_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_REVISION__TECHNICAL_STATUS:
				setTechnicalStatus(TECHNICAL_STATUS_EDEFAULT);
				return;
			case PrsPackage.PRS_REVISION__EDITORIAL_STATUS:
				setEditorialStatus(EDITORIAL_STATUS_EDEFAULT);
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
			case PrsPackage.PRS_REVISION__REVISION_DATE:
				return REVISION_DATE_EDEFAULT == null ? revisionDate != null : !REVISION_DATE_EDEFAULT.equals(revisionDate);
			case PrsPackage.PRS_REVISION__ACTIVITY_NAME:
				return ACTIVITY_NAME_EDEFAULT == null ? activityName != null : !ACTIVITY_NAME_EDEFAULT.equals(activityName);
			case PrsPackage.PRS_REVISION__ACTIVITY_TYPE:
				return ACTIVITY_TYPE_EDEFAULT == null ? activityType != null : !ACTIVITY_TYPE_EDEFAULT.equals(activityType);
			case PrsPackage.PRS_REVISION__TECHNICAL_STATUS:
				return TECHNICAL_STATUS_EDEFAULT == null ? technicalStatus != null : !TECHNICAL_STATUS_EDEFAULT.equals(technicalStatus);
			case PrsPackage.PRS_REVISION__EDITORIAL_STATUS:
				return EDITORIAL_STATUS_EDEFAULT == null ? editorialStatus != null : !EDITORIAL_STATUS_EDEFAULT.equals(editorialStatus);
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
		result.append(" (RevisionDate: ");
		result.append(revisionDate);
		result.append(", ActivityName: ");
		result.append(activityName);
		result.append(", ActivityType: ");
		result.append(activityType);
		result.append(", TechnicalStatus: ");
		result.append(technicalStatus);
		result.append(", EditorialStatus: ");
		result.append(editorialStatus);
		result.append(')');
		return result.toString();
	}

} //PRS_RevisionImpl
