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
import gov.nist.csrc.ns.oscal.MarkupBlockQuote;
import gov.nist.csrc.ns.oscal.MarkupImage;
import gov.nist.csrc.ns.oscal.MarkupList;
import gov.nist.csrc.ns.oscal.MarkupOrderedList;
import gov.nist.csrc.ns.oscal.MarkupPreformatted;
import gov.nist.csrc.ns.oscal.MarkupTable;
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
 * An implementation of the model object '<em><b>Markup Block Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getBlockElementGroup <em>Block Element Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getP <em>P</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MarkupBlockQuoteImpl#getImg <em>Img</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkupBlockQuoteImpl extends MinimalEObjectImpl.Container implements MarkupBlockQuote {
	/**
	 * The cached value of the '{@link #getBlockElementGroup() <em>Block Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap blockElementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupBlockQuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMarkupBlockQuote();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBlockElementGroup() {
		if (blockElementGroup == null) {
			blockElementGroup = new BasicFeatureMap(this, OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP);
		}
		return blockElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH1() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH2() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH3() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH4() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH5() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getH6() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupList> getUl() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupOrderedList> getOl() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupPreformatted> getPre() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getHr() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupBlockQuote> getBlockquote() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InlineMarkup> getP() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupTable> getTable() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarkupImage> getImg() {
		return getBlockElementGroup().list(OSCALPackage.eINSTANCE.getMarkupBlockQuote_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP:
				return ((InternalEList<?>)getBlockElementGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case OSCALPackage.MARKUP_BLOCK_QUOTE__IMG:
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
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP:
				if (coreType) return getBlockElementGroup();
				return ((FeatureMap.Internal)getBlockElementGroup()).getWrapper();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H1:
				return getH1();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H2:
				return getH2();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H3:
				return getH3();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H4:
				return getH4();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H5:
				return getH5();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H6:
				return getH6();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__UL:
				return getUl();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__OL:
				return getOl();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__PRE:
				return getPre();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__HR:
				return getHr();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCKQUOTE:
				return getBlockquote();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__P:
				return getP();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__TABLE:
				return getTable();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__IMG:
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
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP:
				((FeatureMap.Internal)getBlockElementGroup()).set(newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends MarkupList>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends MarkupOrderedList>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends MarkupPreformatted>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends EObject>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends MarkupBlockQuote>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__P:
				getP().clear();
				getP().addAll((Collection<? extends InlineMarkup>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends MarkupTable>)newValue);
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__IMG:
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
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP:
				getBlockElementGroup().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H1:
				getH1().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H2:
				getH2().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H3:
				getH3().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H4:
				getH4().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H5:
				getH5().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H6:
				getH6().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__UL:
				getUl().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__OL:
				getOl().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__PRE:
				getPre().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__HR:
				getHr().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__P:
				getP().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__TABLE:
				getTable().clear();
				return;
			case OSCALPackage.MARKUP_BLOCK_QUOTE__IMG:
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
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCK_ELEMENT_GROUP:
				return blockElementGroup != null && !blockElementGroup.isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H1:
				return !getH1().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H2:
				return !getH2().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H3:
				return !getH3().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H4:
				return !getH4().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H5:
				return !getH5().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__H6:
				return !getH6().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__UL:
				return !getUl().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__OL:
				return !getOl().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__PRE:
				return !getPre().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__HR:
				return !getHr().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__P:
				return !getP().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__TABLE:
				return !getTable().isEmpty();
			case OSCALPackage.MARKUP_BLOCK_QUOTE__IMG:
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
		result.append(" (blockElementGroup: ");
		result.append(blockElementGroup);
		result.append(')');
		return result.toString();
	}

} //MarkupBlockQuoteImpl
