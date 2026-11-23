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

import org.dmtf.cim.CIM_ESPTransform;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM ESP Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getIntegrityTransformId <em>Integrity Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getOtherIntegrityTransformId <em>Other Integrity Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getCipherTransformId <em>Cipher Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getOtherCipherTransformId <em>Other Cipher Transform Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getCipherKeyLength <em>Cipher Key Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getCipherKeyRounds <em>Cipher Key Rounds</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getUseReplayPrevention <em>Use Replay Prevention</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ESPTransformImpl#getReplayPreventionWindowSize <em>Replay Prevention Window Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ESPTransformImpl extends CIM_SATransformImpl implements CIM_ESPTransform {
	/**
	 * The default value of the '{@link #getIntegrityTransformId() <em>Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGRITY_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntegrityTransformId() <em>Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityTransformId()
	 * @generated
	 * @ordered
	 */
	protected Integer integrityTransformId = INTEGRITY_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIntegrityTransformId() <em>Other Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIntegrityTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INTEGRITY_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIntegrityTransformId() <em>Other Integrity Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIntegrityTransformId()
	 * @generated
	 * @ordered
	 */
	protected String otherIntegrityTransformId = OTHER_INTEGRITY_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipherTransformId() <em>Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CIPHER_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCipherTransformId() <em>Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherTransformId()
	 * @generated
	 * @ordered
	 */
	protected Integer cipherTransformId = CIPHER_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCipherTransformId() <em>Other Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCipherTransformId()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CIPHER_TRANSFORM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCipherTransformId() <em>Other Cipher Transform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCipherTransformId()
	 * @generated
	 * @ordered
	 */
	protected String otherCipherTransformId = OTHER_CIPHER_TRANSFORM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipherKeyLength() <em>Cipher Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherKeyLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CIPHER_KEY_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCipherKeyLength() <em>Cipher Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherKeyLength()
	 * @generated
	 * @ordered
	 */
	protected Integer cipherKeyLength = CIPHER_KEY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCipherKeyRounds() <em>Cipher Key Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherKeyRounds()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CIPHER_KEY_ROUNDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCipherKeyRounds() <em>Cipher Key Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCipherKeyRounds()
	 * @generated
	 * @ordered
	 */
	protected Integer cipherKeyRounds = CIPHER_KEY_ROUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseReplayPrevention() <em>Use Replay Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplayPrevention()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_REPLAY_PREVENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseReplayPrevention() <em>Use Replay Prevention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplayPrevention()
	 * @generated
	 * @ordered
	 */
	protected Boolean useReplayPrevention = USE_REPLAY_PREVENTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplayPreventionWindowSize() <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplayPreventionWindowSize() <em>Replay Prevention Window Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplayPreventionWindowSize()
	 * @generated
	 * @ordered
	 */
	protected Long replayPreventionWindowSize = REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ESPTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ESPTransform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIntegrityTransformId() {
		return integrityTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrityTransformId(Integer newIntegrityTransformId) {
		Integer oldIntegrityTransformId = integrityTransformId;
		integrityTransformId = newIntegrityTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__INTEGRITY_TRANSFORM_ID, oldIntegrityTransformId, integrityTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherIntegrityTransformId() {
		return otherIntegrityTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIntegrityTransformId(String newOtherIntegrityTransformId) {
		String oldOtherIntegrityTransformId = otherIntegrityTransformId;
		otherIntegrityTransformId = newOtherIntegrityTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__OTHER_INTEGRITY_TRANSFORM_ID, oldOtherIntegrityTransformId, otherIntegrityTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCipherTransformId() {
		return cipherTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherTransformId(Integer newCipherTransformId) {
		Integer oldCipherTransformId = cipherTransformId;
		cipherTransformId = newCipherTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__CIPHER_TRANSFORM_ID, oldCipherTransformId, cipherTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCipherTransformId() {
		return otherCipherTransformId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCipherTransformId(String newOtherCipherTransformId) {
		String oldOtherCipherTransformId = otherCipherTransformId;
		otherCipherTransformId = newOtherCipherTransformId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__OTHER_CIPHER_TRANSFORM_ID, oldOtherCipherTransformId, otherCipherTransformId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCipherKeyLength() {
		return cipherKeyLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherKeyLength(Integer newCipherKeyLength) {
		Integer oldCipherKeyLength = cipherKeyLength;
		cipherKeyLength = newCipherKeyLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_LENGTH, oldCipherKeyLength, cipherKeyLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCipherKeyRounds() {
		return cipherKeyRounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCipherKeyRounds(Integer newCipherKeyRounds) {
		Integer oldCipherKeyRounds = cipherKeyRounds;
		cipherKeyRounds = newCipherKeyRounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_ROUNDS, oldCipherKeyRounds, cipherKeyRounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseReplayPrevention() {
		return useReplayPrevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseReplayPrevention(Boolean newUseReplayPrevention) {
		Boolean oldUseReplayPrevention = useReplayPrevention;
		useReplayPrevention = newUseReplayPrevention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__USE_REPLAY_PREVENTION, oldUseReplayPrevention, useReplayPrevention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReplayPreventionWindowSize() {
		return replayPreventionWindowSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplayPreventionWindowSize(Long newReplayPreventionWindowSize) {
		Long oldReplayPreventionWindowSize = replayPreventionWindowSize;
		replayPreventionWindowSize = newReplayPreventionWindowSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ESP_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE, oldReplayPreventionWindowSize, replayPreventionWindowSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ESP_TRANSFORM__INTEGRITY_TRANSFORM_ID:
				return getIntegrityTransformId();
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_INTEGRITY_TRANSFORM_ID:
				return getOtherIntegrityTransformId();
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_TRANSFORM_ID:
				return getCipherTransformId();
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_CIPHER_TRANSFORM_ID:
				return getOtherCipherTransformId();
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_LENGTH:
				return getCipherKeyLength();
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_ROUNDS:
				return getCipherKeyRounds();
			case CimPackage.CIM_ESP_TRANSFORM__USE_REPLAY_PREVENTION:
				return getUseReplayPrevention();
			case CimPackage.CIM_ESP_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				return getReplayPreventionWindowSize();
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
			case CimPackage.CIM_ESP_TRANSFORM__INTEGRITY_TRANSFORM_ID:
				setIntegrityTransformId((Integer)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_INTEGRITY_TRANSFORM_ID:
				setOtherIntegrityTransformId((String)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_TRANSFORM_ID:
				setCipherTransformId((Integer)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_CIPHER_TRANSFORM_ID:
				setOtherCipherTransformId((String)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_LENGTH:
				setCipherKeyLength((Integer)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_ROUNDS:
				setCipherKeyRounds((Integer)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__USE_REPLAY_PREVENTION:
				setUseReplayPrevention((Boolean)newValue);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				setReplayPreventionWindowSize((Long)newValue);
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
			case CimPackage.CIM_ESP_TRANSFORM__INTEGRITY_TRANSFORM_ID:
				setIntegrityTransformId(INTEGRITY_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_INTEGRITY_TRANSFORM_ID:
				setOtherIntegrityTransformId(OTHER_INTEGRITY_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_TRANSFORM_ID:
				setCipherTransformId(CIPHER_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_CIPHER_TRANSFORM_ID:
				setOtherCipherTransformId(OTHER_CIPHER_TRANSFORM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_LENGTH:
				setCipherKeyLength(CIPHER_KEY_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_ROUNDS:
				setCipherKeyRounds(CIPHER_KEY_ROUNDS_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__USE_REPLAY_PREVENTION:
				setUseReplayPrevention(USE_REPLAY_PREVENTION_EDEFAULT);
				return;
			case CimPackage.CIM_ESP_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				setReplayPreventionWindowSize(REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT);
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
			case CimPackage.CIM_ESP_TRANSFORM__INTEGRITY_TRANSFORM_ID:
				return INTEGRITY_TRANSFORM_ID_EDEFAULT == null ? integrityTransformId != null : !INTEGRITY_TRANSFORM_ID_EDEFAULT.equals(integrityTransformId);
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_INTEGRITY_TRANSFORM_ID:
				return OTHER_INTEGRITY_TRANSFORM_ID_EDEFAULT == null ? otherIntegrityTransformId != null : !OTHER_INTEGRITY_TRANSFORM_ID_EDEFAULT.equals(otherIntegrityTransformId);
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_TRANSFORM_ID:
				return CIPHER_TRANSFORM_ID_EDEFAULT == null ? cipherTransformId != null : !CIPHER_TRANSFORM_ID_EDEFAULT.equals(cipherTransformId);
			case CimPackage.CIM_ESP_TRANSFORM__OTHER_CIPHER_TRANSFORM_ID:
				return OTHER_CIPHER_TRANSFORM_ID_EDEFAULT == null ? otherCipherTransformId != null : !OTHER_CIPHER_TRANSFORM_ID_EDEFAULT.equals(otherCipherTransformId);
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_LENGTH:
				return CIPHER_KEY_LENGTH_EDEFAULT == null ? cipherKeyLength != null : !CIPHER_KEY_LENGTH_EDEFAULT.equals(cipherKeyLength);
			case CimPackage.CIM_ESP_TRANSFORM__CIPHER_KEY_ROUNDS:
				return CIPHER_KEY_ROUNDS_EDEFAULT == null ? cipherKeyRounds != null : !CIPHER_KEY_ROUNDS_EDEFAULT.equals(cipherKeyRounds);
			case CimPackage.CIM_ESP_TRANSFORM__USE_REPLAY_PREVENTION:
				return USE_REPLAY_PREVENTION_EDEFAULT == null ? useReplayPrevention != null : !USE_REPLAY_PREVENTION_EDEFAULT.equals(useReplayPrevention);
			case CimPackage.CIM_ESP_TRANSFORM__REPLAY_PREVENTION_WINDOW_SIZE:
				return REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT == null ? replayPreventionWindowSize != null : !REPLAY_PREVENTION_WINDOW_SIZE_EDEFAULT.equals(replayPreventionWindowSize);
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
		result.append(" (IntegrityTransformId: ");
		result.append(integrityTransformId);
		result.append(", OtherIntegrityTransformId: ");
		result.append(otherIntegrityTransformId);
		result.append(", CipherTransformId: ");
		result.append(cipherTransformId);
		result.append(", OtherCipherTransformId: ");
		result.append(otherCipherTransformId);
		result.append(", CipherKeyLength: ");
		result.append(cipherKeyLength);
		result.append(", CipherKeyRounds: ");
		result.append(cipherKeyRounds);
		result.append(", UseReplayPrevention: ");
		result.append(useReplayPrevention);
		result.append(", ReplayPreventionWindowSize: ");
		result.append(replayPreventionWindowSize);
		result.append(')');
		return result.toString();
	}

} //CIM_ESPTransformImpl
