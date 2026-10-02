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

import gov.nist.csrc.ns.oscal.InlineMarkup;
import gov.nist.csrc.ns.oscal.MarkupAnchor;
import gov.nist.csrc.ns.oscal.MarkupCode;
import gov.nist.csrc.ns.oscal.MarkupImage;
import gov.nist.csrc.ns.oscal.MarkupInsert;
import gov.nist.csrc.ns.oscal.OSCALPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Markup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getInlineMarkupGroup <em>Inline Markup Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getA <em>A</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getInsert <em>Insert</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getBr <em>Br</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getEm <em>Em</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getI <em>I</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getB <em>B</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getQ <em>Q</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InlineMarkupImpl#getImg <em>Img</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineMarkupImpl extends MinimalEObjectImpl.Container implements InlineMarkup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineMarkupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getInlineMarkup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OSCALPackage.INLINE_MARKUP__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getInlineMarkupGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(OSCALPackage.eINSTANCE.getInlineMarkup_InlineMarkupGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupAnchor> getA() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupInsert> getInsert() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Insert());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getBr() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupCode> getCode() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getEm() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getI() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getB() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getStrong() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSub() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getSup() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getQ() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupImage> getImg() {
		return getInlineMarkupGroup().list(OSCALPackage.eINSTANCE.getInlineMarkup_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.INLINE_MARKUP__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__INLINE_MARKUP_GROUP:
				return ((InternalEList<?>)getInlineMarkupGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__INSERT:
				return ((InternalEList<?>)getInsert()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INLINE_MARKUP__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.INLINE_MARKUP__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OSCALPackage.INLINE_MARKUP__INLINE_MARKUP_GROUP:
				if (coreType) return getInlineMarkupGroup();
				return ((FeatureMap.Internal)getInlineMarkupGroup()).getWrapper();
			case OSCALPackage.INLINE_MARKUP__A:
				return getA();
			case OSCALPackage.INLINE_MARKUP__INSERT:
				return getInsert();
			case OSCALPackage.INLINE_MARKUP__BR:
				return getBr();
			case OSCALPackage.INLINE_MARKUP__CODE:
				return getCode();
			case OSCALPackage.INLINE_MARKUP__EM:
				return getEm();
			case OSCALPackage.INLINE_MARKUP__I:
				return getI();
			case OSCALPackage.INLINE_MARKUP__B:
				return getB();
			case OSCALPackage.INLINE_MARKUP__STRONG:
				return getStrong();
			case OSCALPackage.INLINE_MARKUP__SUB:
				return getSub();
			case OSCALPackage.INLINE_MARKUP__SUP:
				return getSup();
			case OSCALPackage.INLINE_MARKUP__Q:
				return getQ();
			case OSCALPackage.INLINE_MARKUP__IMG:
				return getImg();
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
			case OSCALPackage.INLINE_MARKUP__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__INLINE_MARKUP_GROUP:
				((FeatureMap.Internal)getInlineMarkupGroup()).set(newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__A:
				getA().clear();
				getA().addAll((Collection<? extends MarkupAnchor>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__INSERT:
				getInsert().clear();
				getInsert().addAll((Collection<? extends MarkupInsert>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends EObject>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends MarkupCode>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__I:
				getI().clear();
				getI().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__B:
				getB().clear();
				getB().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.INLINE_MARKUP__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends MarkupImage>)newValue);
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
			case OSCALPackage.INLINE_MARKUP__MIXED:
				getMixed().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__INLINE_MARKUP_GROUP:
				getInlineMarkupGroup().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__A:
				getA().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__INSERT:
				getInsert().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__BR:
				getBr().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__CODE:
				getCode().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__EM:
				getEm().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__I:
				getI().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__B:
				getB().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__STRONG:
				getStrong().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__SUB:
				getSub().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__SUP:
				getSup().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__Q:
				getQ().clear();
				return;
			case OSCALPackage.INLINE_MARKUP__IMG:
				getImg().clear();
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
			case OSCALPackage.INLINE_MARKUP__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OSCALPackage.INLINE_MARKUP__INLINE_MARKUP_GROUP:
				return !getInlineMarkupGroup().isEmpty();
			case OSCALPackage.INLINE_MARKUP__A:
				return !getA().isEmpty();
			case OSCALPackage.INLINE_MARKUP__INSERT:
				return !getInsert().isEmpty();
			case OSCALPackage.INLINE_MARKUP__BR:
				return !getBr().isEmpty();
			case OSCALPackage.INLINE_MARKUP__CODE:
				return !getCode().isEmpty();
			case OSCALPackage.INLINE_MARKUP__EM:
				return !getEm().isEmpty();
			case OSCALPackage.INLINE_MARKUP__I:
				return !getI().isEmpty();
			case OSCALPackage.INLINE_MARKUP__B:
				return !getB().isEmpty();
			case OSCALPackage.INLINE_MARKUP__STRONG:
				return !getStrong().isEmpty();
			case OSCALPackage.INLINE_MARKUP__SUB:
				return !getSub().isEmpty();
			case OSCALPackage.INLINE_MARKUP__SUP:
				return !getSup().isEmpty();
			case OSCALPackage.INLINE_MARKUP__Q:
				return !getQ().isEmpty();
			case OSCALPackage.INLINE_MARKUP__IMG:
				return !getImg().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InlineMarkupImpl
