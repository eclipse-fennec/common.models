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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_ChangerDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Changer Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChangerDeviceImpl#getMaxTransitTime <em>Max Transit Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChangerDeviceImpl#getMediaFlipSupported <em>Media Flip Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChangerDeviceImpl#getAuditInProgress <em>Audit In Progress</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ChangerDeviceImpl#getAuditsPerformed <em>Audits Performed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ChangerDeviceImpl extends CIM_MediaTransferDeviceImpl implements CIM_ChangerDevice {
	/**
	 * The default value of the '{@link #getMaxTransitTime() <em>Max Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransitTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TRANSIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTransitTime() <em>Max Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTransitTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxTransitTime = MAX_TRANSIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaFlipSupported() <em>Media Flip Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaFlipSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MEDIA_FLIP_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaFlipSupported() <em>Media Flip Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaFlipSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean mediaFlipSupported = MEDIA_FLIP_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuditInProgress() <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIT_IN_PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditInProgress() <em>Audit In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditInProgress()
	 * @generated
	 * @ordered
	 */
	protected Boolean auditInProgress = AUDIT_IN_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuditsPerformed() <em>Audits Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditsPerformed()
	 * @generated
	 * @ordered
	 */
	protected static final Long AUDITS_PERFORMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuditsPerformed() <em>Audits Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditsPerformed()
	 * @generated
	 * @ordered
	 */
	protected Long auditsPerformed = AUDITS_PERFORMED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ChangerDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ChangerDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTransitTime() {
		return maxTransitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTransitTime(Long newMaxTransitTime) {
		Long oldMaxTransitTime = maxTransitTime;
		maxTransitTime = newMaxTransitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHANGER_DEVICE__MAX_TRANSIT_TIME, oldMaxTransitTime, maxTransitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMediaFlipSupported() {
		return mediaFlipSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaFlipSupported(Boolean newMediaFlipSupported) {
		Boolean oldMediaFlipSupported = mediaFlipSupported;
		mediaFlipSupported = newMediaFlipSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHANGER_DEVICE__MEDIA_FLIP_SUPPORTED, oldMediaFlipSupported, mediaFlipSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAuditInProgress() {
		return auditInProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditInProgress(Boolean newAuditInProgress) {
		Boolean oldAuditInProgress = auditInProgress;
		auditInProgress = newAuditInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHANGER_DEVICE__AUDIT_IN_PROGRESS, oldAuditInProgress, auditInProgress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAuditsPerformed() {
		return auditsPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditsPerformed(Long newAuditsPerformed) {
		Long oldAuditsPerformed = auditsPerformed;
		auditsPerformed = newAuditsPerformed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CHANGER_DEVICE__AUDITS_PERFORMED, oldAuditsPerformed, auditsPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CHANGER_DEVICE__MAX_TRANSIT_TIME:
				return getMaxTransitTime();
			case CimPackage.CIM_CHANGER_DEVICE__MEDIA_FLIP_SUPPORTED:
				return getMediaFlipSupported();
			case CimPackage.CIM_CHANGER_DEVICE__AUDIT_IN_PROGRESS:
				return getAuditInProgress();
			case CimPackage.CIM_CHANGER_DEVICE__AUDITS_PERFORMED:
				return getAuditsPerformed();
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
			case CimPackage.CIM_CHANGER_DEVICE__MAX_TRANSIT_TIME:
				setMaxTransitTime((Long)newValue);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__MEDIA_FLIP_SUPPORTED:
				setMediaFlipSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__AUDIT_IN_PROGRESS:
				setAuditInProgress((Boolean)newValue);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__AUDITS_PERFORMED:
				setAuditsPerformed((Long)newValue);
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
			case CimPackage.CIM_CHANGER_DEVICE__MAX_TRANSIT_TIME:
				setMaxTransitTime(MAX_TRANSIT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__MEDIA_FLIP_SUPPORTED:
				setMediaFlipSupported(MEDIA_FLIP_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__AUDIT_IN_PROGRESS:
				setAuditInProgress(AUDIT_IN_PROGRESS_EDEFAULT);
				return;
			case CimPackage.CIM_CHANGER_DEVICE__AUDITS_PERFORMED:
				setAuditsPerformed(AUDITS_PERFORMED_EDEFAULT);
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
			case CimPackage.CIM_CHANGER_DEVICE__MAX_TRANSIT_TIME:
				return MAX_TRANSIT_TIME_EDEFAULT == null ? maxTransitTime != null : !MAX_TRANSIT_TIME_EDEFAULT.equals(maxTransitTime);
			case CimPackage.CIM_CHANGER_DEVICE__MEDIA_FLIP_SUPPORTED:
				return MEDIA_FLIP_SUPPORTED_EDEFAULT == null ? mediaFlipSupported != null : !MEDIA_FLIP_SUPPORTED_EDEFAULT.equals(mediaFlipSupported);
			case CimPackage.CIM_CHANGER_DEVICE__AUDIT_IN_PROGRESS:
				return AUDIT_IN_PROGRESS_EDEFAULT == null ? auditInProgress != null : !AUDIT_IN_PROGRESS_EDEFAULT.equals(auditInProgress);
			case CimPackage.CIM_CHANGER_DEVICE__AUDITS_PERFORMED:
				return AUDITS_PERFORMED_EDEFAULT == null ? auditsPerformed != null : !AUDITS_PERFORMED_EDEFAULT.equals(auditsPerformed);
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
		result.append(" (MaxTransitTime: ");
		result.append(maxTransitTime);
		result.append(", MediaFlipSupported: ");
		result.append(mediaFlipSupported);
		result.append(", AuditInProgress: ");
		result.append(auditInProgress);
		result.append(", AuditsPerformed: ");
		result.append(auditsPerformed);
		result.append(')');
		return result.toString();
	}

} //CIM_ChangerDeviceImpl
